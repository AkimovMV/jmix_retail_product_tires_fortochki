package com.makimov.retailproducttiresfortochki.services;

import com.makimov.retailproducttiresfortochki.entity.TireDTO;
import com.makimov.retailproducttiresfortochki.entity.TireStockDTO;
import com.makimov.retailproducttiresfortochki.entity.Warehouse;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import io.jmix.core.DataManager;
import jakarta.xml.bind.JAXBElement;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.*;
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

    @Autowired
    private TireStockClearService tireStockClearService;

    @Autowired
    private TireService tireService;


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

    public ArrayList<Integer> getWarehousesForStocks() {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(2017);
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
            //arrayOfint.getInt().add(2017);  //для примера добавили склад с кодом 2017 - челябинск 2
            //фильтр не отрабатывает и в 1с. сервис отдает все остатки
            ArrayList<Integer> warehousesGetStocks = this.getWarehousesForStocks();

            JAXBElement<ArrayOfint> wrhlist = new JAXBElement<ArrayOfint>(arrayQName,ArrayOfint.class,arrayOfint);

            findTyreFilter.setWrhList(wrhlist);
            findTyreFilter.setQuality(0);

            int currentPage = 0;
            int pageSize = 1000;
            boolean nextIteration = true;

            HashMap<String, TireStockDTO> tireStockMap = new HashMap<>();

            while (nextIteration) {
                ResultFindTyre resultFindTyre = baseClientService.getFindTyre(this.fortochkiLogin, this.fortochkiPassword, findTyreFilter, currentPage, pageSize);
                int totalPages = resultFindTyre.getTotalPages().intValue();

                if (resultFindTyre.getError().getValue() != null) {
                    System.out.println("fetchTireStocks ERROR: " + resultFindTyre.getError().getValue().getComment().getValue());
                    nextIteration = false;
                } else {

                    List<TyrePriceRest> tyrePriceRest = resultFindTyre.getPriceRestList().getValue().getTyrePriceRest();

                    for (TyrePriceRest s : tyrePriceRest) {
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
                            Integer warehouseCode = rest.getWrh().intValue();
                            if (warehousesGetStocks.contains(warehouseCode)) {
                                //if (s.getCode().getValue().equals("T743399")) {
                                TireStockDTO tireStock = dataManager.create(TireStockDTO.class);
                                tireStock.setCode(s.getCode().getValue());
                                tireStock.setMarka(s.getMarka().getValue());
                                tireStock.setWrh(Integer.toString(warehouseCode));
                                tireStock.setPrice(rest.getPrice().getValue());
                                tireStock.setPrice_rozn(rest.getPriceRozn().getValue());
                                tireStock.setRest(rest.getRest().intValue());
                                String uniqueKey = tireStock.uniqueKey();

                                if (tireStockMap.containsKey(uniqueKey)) {
                                    System.out.println("Данные уже существуют (будут заменены последней записью) по Склад: " + tireStock.getWrh() + " Код производителя " + tireStock.getCode() + " Производитель " + tireStock.getMarka());
                                }
                                tireStockMap.put(uniqueKey, tireStock);
                                //  }
                            }
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

    //список кодов не больше 200
    public List<TireDTO> fetchTiresPart(List<String> listCodes){
        List<TireDTO> result  = new ArrayList<TireDTO>();

        try {
            ClientService_Service clientService = new ClientService_Service();
            ClientService baseClientService =  clientService.getBasicHttpBindingClientService();

            ArrayOfstring codeList = new ArrayOfstring();
            codeList.getString().addAll(listCodes);

            ResultGetGoodsInfo resultGetGoodsInfo = baseClientService.getGoodsInfo(this.fortochkiLogin, this.fortochkiPassword,codeList);

            if (resultGetGoodsInfo.getError().getValue() != null) {
                System.out.println("fetchTiresPart ERROR: " + resultGetGoodsInfo.getError().getValue().getComment().getValue());
            } else {
                resultGetGoodsInfo.getTyreList().getValue().getTyreContainer().forEach(tire ->{
                    //если не указан код производителя или производитель, то такие позиции не берем
                    if (!(tire.getCode().isNil() || tire.getBrand().isNil() || tire.getType().isNil() )) {
                        TireDTO tireDTO = dataManager.create(TireDTO.class);
                        tireDTO.setCode(tire.getCode().getValue());
                        tireDTO.setName(tire.getName().getValue());
                        tireDTO.setType(tire.getType().getValue());
                        tireDTO.setBrand(tire.getBrand().getValue());
                        if (!tire.getModel().isNil()){
                            tireDTO.setModel(tire.getModel().getValue());
                        }

                        if (!tire.getDiameter().isNil()){
                            tireDTO.setDiameter(tire.getDiameter().getValue().toString());
                        }

                        if (!tire.getDiameterOut().isNil()){
                            tireDTO.setDiameter_out(tire.getDiameterOut().getValue().toString());
                        }

                        if (!tire.getWidth().isNil()){
                            tireDTO.setWidth(tire.getWidth().getValue().toString());
                        }

                        if (!tire.getSubwidth().isNil()){
                            tireDTO.setSubwidth(tire.getSubwidth().getValue().toString());
                        }

                        if (!tire.getHeight().isNil()){
                            tireDTO.setHeight(tire.getHeight().getValue().toString());
                        }

                        if (!tire.getSubheight().isNil()){
                            tireDTO.setSubheight(tire.getSubheight().getValue().toString());
                        }

                        if (!tire.getLoadIndex().isNil()){
                            tireDTO.setLoad_index(tire.getLoadIndex().getValue());
                        }

                        if (!tire.getSpeedIndex().isNil()){
                            tireDTO.setSpeed_index(tire.getSpeedIndex().getValue());
                        }

                        tireDTO.setThorn(tire.isThorn());

                        if (!tire.getConstr().isNil()){
                            tireDTO.setConstr(tire.getConstr().getValue());
                        }

                        if (!tire.getConstr().isNil()){
                            tireDTO.setConstr(tire.getConstr().getValue());
                        }

                        if (!tire.getSloy().isNil()){
                            tireDTO.setSloy(tire.getSloy().getValue());
                        }

                        if (!tire.getAxle().isNil()){
                            tireDTO.setAxle(tire.getAxle().getValue());
                        }

                        if (!tire.getImgBigMy().isNil()){
                            tireDTO.setImg_big_my(tire.getImgBigMy().getValue());
                        }

                        if (!tire.getImgSmall().isNil()){
                            tireDTO.setImg_small(tire.getImgSmall().getValue());
                        }

                        if (!tire.getOmolog().isNil()){
                            tireDTO.setOmolog(tire.getOmolog().getValue());
                        }

                        if (!tire.getPuncture().isNil()){
                            tireDTO.setPuncture(tire.getPuncture().getValue());
                        }

                        if (!tire.getThornType().isNil()){
                            tireDTO.setThorn_type(tire.getThornType().getValue());
                        }

                        if (!tire.getTech().isNil()){
                            tireDTO.setTech(tire.getTech().getValue());
                        }

                        if (!tire.getProtectorType().isNil()){
                            tireDTO.setProtector_type(tire.getProtectorType().getValue());
                        }

                        if (!tire.getUseType().isNil()){
                            tireDTO.setUse_type(tire.getUseType().getValue());
                        }

                        if (!tire.getSeason().isNil()){
                            tireDTO.setSeason(tire.getSeason().getValue());
                        }

                        result.add(tireDTO);
                    }
                });
            }
        } catch (Exception e) {
            System.out.println("fetchTiresPart result: "+e.toString());
        }

        return result;
    }

    public List<TireDTO> fetchTires(){
        List<TireDTO> result  = new ArrayList<TireDTO>();

        try {
            List<String> listCodes = this.tireStockService.getCodesWithStocks();
            List<String[]> splitedArrays = Utils.splitArray(listCodes.toArray(new String[0]),100) ;
            int iter = 1;
            int splitedArraysSize = splitedArrays.size();
            for (String[] chunk : splitedArrays) {
                List<TireDTO> partResult = fetchTiresPart(Arrays.stream(chunk).toList());
                result.addAll(partResult);
                System.out.println("fetchTires part "+iter+" / "+splitedArraysSize);
                iter++;
            }

        } catch (Exception e) {
            System.out.println("fetchTires result: "+e.toString());
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
            //разделение с очисткой на разные бины, чтобы спринг отработал транзакции самостоятельно
            this.tireStockClearService.clearTireStock();
            this.tireStockService.saveTireStocks(list);

        } catch (Exception e) {
            System.out.println("saveTireStocksFromWsdl error: "+e.toString());
        }

        LocalDateTime dateEnd = LocalDateTime.now();
        System.out.println("saveTireStocksFromWsdl end "+ Utils.formatDateTime(dateEnd));
        System.out.println("saveTireStocksFromWsdl time: "+ ChronoUnit.SECONDS.between(dateStart, dateEnd));

    }

    public void saveTiresByStocksFromWsdl() {
        LocalDateTime dateStart = LocalDateTime.now();
        System.out.println("saveTiresByStocksFromWsdl start "+ Utils.formatDateTime(dateStart));
        List<TireDTO> list =  this.fetchTires();
        this.tireService.saveTires(list);

        LocalDateTime dateEnd = LocalDateTime.now();
        System.out.println("saveTiresByStocksFromWsdl end "+ Utils.formatDateTime(dateEnd));
        System.out.println("saveTiresByStocksFromWsdl time: "+ ChronoUnit.SECONDS.between(dateStart, dateEnd));
    }

}
