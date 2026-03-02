package com.makimov.retailproducttiresfortochki.services;

import com.makimov.retailproducttiresfortochki.entity.Warehouse;
import io.jmix.core.DataManager;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetWarehousesResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ts3.webapi.client.clientservice.wcf.ClientService;
import ts3.webapi.client.clientservice.wcf.ClientService_Service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

@Service
public class ProductService {
    @Autowired
    private DataManager dataManager;

    @Autowired
    private WarehouseService warehouseService;

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
            }
            System.out.println("fortochki result: "+result);
        } catch (Exception e) {
            System.out.println("fortochki result: "+e.toString());
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
}
