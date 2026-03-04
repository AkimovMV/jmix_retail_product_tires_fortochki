package com.makimov.retailproducttiresfortochki.services;

import com.makimov.retailproducttiresfortochki.entity.TireStockDTO;
import com.makimov.retailproducttiresfortochki.entity.Warehouse;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import io.jmix.core.DataManager;
import jakarta.xml.bind.JAXBElement;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.FindTyreFilter;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetWarehousesResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ResultFindTyre;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.TyrePriceRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ts3.webapi.client.clientservice.wcf.ClientService;
import ts3.webapi.client.clientservice.wcf.ClientService_Service;

import javax.xml.namespace.QName;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

@Service
public class ProductService {
    @Autowired
    private DataManager dataManager;

    @Autowired
    private WarehouseService warehouseService;

    @Autowired
    private TireStockService tireStockService;

    @Value("${fortochki.api.login}")
    private String fortochkiLogin;

    @Value("${fortochki.api.password}")
    private String fortochkiPassword;

    public boolean fortochkiPing(){
        boolean pingResult = false;
        try {
            ClientService_Service clientService = new ClientService_Service();
            ClientService baseClientService =  clientService.getBasicHttpBindingClientService();
            pingResult = baseClientService.ping(this.fortochkiLogin, this.fortochkiPassword);
            System.out.println("fortochki ping result: "+pingResult);
        } catch (Exception e) {
            System.out.println("fortochki ping result: "+e.toString());
        }
        return pingResult;
    }

    public List<Warehouse> fetchWarehouses(){
        List<Warehouse> result  = new ArrayList<Warehouse>();

        try {
            ClientService_Service clientService = new ClientService_Service();
            ClientService baseClientService =  clientService.getBasicHttpBindingClientService();
            GetWarehousesResult warehousesResult = baseClientService.getWarehouses(this.fortochkiLogin, this.fortochkiPassword,null);
            if (warehousesResult.isSuccess()) {
                warehousesResult.getWarehouses().getValue().getWarehouseInfo().forEach( (s) -> {
                    Warehouse warehouse = dataManager.create(Warehouse.class);
                    warehouse.setId(s.getId().toString());
                    warehouse.setName(s.getName().getValue());
                    warehouse.setKey(s.getKey().getValue());
                    warehouse.setDays(s.getLogisticDays().intValue());
                    result.add(warehouse);
                });
            } else {

                System.out.println("fortochki ERROR: "+ warehousesResult.getError().getValue().getComment().getValue());
            }
            //System.out.println("fortochki result: "+result);
        } catch (Exception e) {
            System.out.println("fortochki result: "+e.toString());
        }

        return result;
    }

    public List<TireStockDTO> fetchTireStocks(){
        List<TireStockDTO> result  = new ArrayList<TireStockDTO>();

        try {
            ClientService_Service clientService = new ClientService_Service();
            ClientService baseClientService =  clientService.getBasicHttpBindingClientService();
            FindTyreFilter findTyreFilter = new FindTyreFilter();

            QName arrayQName = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint");
            ArrayOfint arrayOfint = new ArrayOfint();
            arrayOfint.getInt().add(2017);  //для примера добавили склад с кодом 2017 - челябинск 2

            JAXBElement<ArrayOfint> wrhlist = new JAXBElement<ArrayOfint>(arrayQName,ArrayOfint.class,arrayOfint);

            findTyreFilter.setWrhList(wrhlist);
            findTyreFilter.setQuality(0);

            int currentPage = 0;
            int pageSize = 1000;
            boolean nextIteration = true;

            HashMap<Integer, TireStockDTO> tireStockMap = new HashMap<>();

            while (nextIteration) {
                ResultFindTyre resultFindTyre = baseClientService.getFindTyre(this.fortochkiLogin, this.fortochkiPassword, findTyreFilter, currentPage, pageSize);
                int totalPages = resultFindTyre.getTotalPages().intValue();

                if (resultFindTyre.getError().getValue() != null) {
                    System.out.println("fetchTireStocks ERROR: " + resultFindTyre.getError().getValue().getComment().getValue());
                    nextIteration = false;
                } else {

                    List<TyrePriceRest> tyrePriceRest = resultFindTyre.getPriceRestList().getValue().getTyrePriceRest();

                    for (TyrePriceRest s : tyrePriceRest) {
                        TireStockDTO tireStock = dataManager.create(TireStockDTO.class);

                        if (s.getCode().isNil()) {
                            continue;
                        }

                        if (s.getWhpr().isNil()) {
                            continue;
                        }

                        if (s.getMarka().isNil()) {
                            continue;
                        }

                        //обход цен и остатков в рамках данных по складам
                        s.getWhpr().getValue().getWhPriceRest().forEach((rest) -> {
                            tireStock.setCode(s.getCode().getValue());
                            tireStock.setMarka(s.getMarka().getValue());
                            tireStock.setWrh(Integer.toString(rest.getWrh().intValue()));
                            tireStock.setPrice(rest.getPrice().getValue());
                            tireStock.setPrice_rozn(rest.getPriceRozn().getValue());
                            tireStock.setRest(rest.getRest().intValue());

                            Integer hashCode = tireStock.hashCode();

                            if (tireStockMap.containsKey(hashCode)) {
                                System.out.println("Данные уже существуют (будут заменены последней записью) по Склад: " + tireStock.getWrh() + " Код производителя "+tireStock.getCode()+ " Производитель "+tireStock.getMarka());
                            }
                            tireStockMap.put(hashCode, tireStock);
                        });

                    }
                }
                System.out.println("fetchTireStocks currentPage: " + currentPage + " from totalPAges: " + totalPages);
                currentPage++;
                if (currentPage >= totalPages ){
                    nextIteration=false;
                }
            }

            result = new ArrayList<TireStockDTO>(tireStockMap.values());
        } catch (Exception e) {
            System.out.println("fetchTireStocks result: "+e.toString());
        }

        return result;
    }

    public void saveWarehousesFromWsdl() {

        LocalDateTime dateStart = LocalDateTime.now();
        System.out.println("saveWarehousesFromWsdl start "+ Utils.formatDateTime(dateStart));
        List<Warehouse> list = this.fetchWarehouses();
        this.warehouseService.saveWarehouses(list);

        LocalDateTime dateEnd = LocalDateTime.now();
        System.out.println("saveWarehousesFromWsdl end "+ Utils.formatDateTime(dateEnd));
        System.out.println("saveWarehousesFromWsdl time: "+ ChronoUnit.SECONDS.between(dateStart, dateEnd));
    }

    public void saveTireStocksFromWsdl() {
        LocalDateTime dateStart = LocalDateTime.now();
        System.out.println("saveTireStocksFromWsdl start "+ Utils.formatDateTime(dateStart));


        try {
            List<TireStockDTO> list = this.fetchTireStocks();
            this.tireStockService.saveTireStocks(list);

        } catch (Exception e) {
            System.out.println("saveTireStocksFromWsdl error: "+e.toString());
        }

        LocalDateTime dateEnd = LocalDateTime.now();
        System.out.println("saveTireStocksFromWsdl end "+ Utils.formatDateTime(dateEnd));
        System.out.println("saveTireStocksFromWsdl time: "+ ChronoUnit.SECONDS.between(dateStart, dateEnd));

    }
}
