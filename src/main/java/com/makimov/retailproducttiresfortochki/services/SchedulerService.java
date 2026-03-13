package com.makimov.retailproducttiresfortochki.services;

import io.jmix.core.security.SystemAuthenticator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Component
//класс для задач планировщика
public class SchedulerService {
    @Autowired
    ProductService productService;

    @Autowired
    private SystemAuthenticator systemAuthenticator;

    //загрузка складов из форточек
    @Scheduled(cron = "${app.cronjobs.warehouseLoad:-}")
    public void executeLoadWarehouseTask() {
        String name = "executeLoadWarehouseTask";
        String result = systemAuthenticator.withSystem(() -> {
            LocalDateTime dateStart = LocalDateTime.now();
            System.out.println(name+" Запуск регламентной задачи "+ Utils.formatDateTime(dateStart));

            try {
                this.productService.saveWarehousesFromWsdl();
            } catch (Exception e) {
                System.out.println(name+" error: "+e.toString());
            }

            LocalDateTime dateEnd = LocalDateTime.now();
            System.out.println(name+" Завершение регламентной задачи "+ Utils.formatDateTime(dateEnd) + " время выполнения "+ ChronoUnit.SECONDS.between(dateStart, dateEnd));
            return "end task";
        });
        System.out.println(name+" "+result);
    }

    //загрузка остатков из форточек
    @Scheduled(cron = "${app.cronjobs.tireStocksLoad:-}")
    public void executeLoadTireStocksTask() {
        String name = "executeLoadTireStocksTask";
        String result = systemAuthenticator.withSystem(() -> {
            LocalDateTime dateStart = LocalDateTime.now();
            System.out.println(name+" Запуск регламентной задачи "+ Utils.formatDateTime(dateStart));

            try {
                this.productService.saveTireStocksFromWsdl();
            } catch (Exception e) {
                System.out.println(name+" error: "+e.toString());
            }

            LocalDateTime dateEnd = LocalDateTime.now();
            System.out.println(name+" Завершение регламентной задачи "+ Utils.formatDateTime(dateEnd) + " время выполнения "+ ChronoUnit.SECONDS.between(dateStart, dateEnd));
            return "end task";
        });
        System.out.println(name+" "+result);
    }

    //загрузка детального описания шин форточек на основе остатков
    @Scheduled(cron = "${app.cronjobs.tireDetailsByStocksLoad:-}")
    public void executeLoadTireDetailsByStocksTask() {
        String name = "executeLoadTireStocksTask";
        String result = systemAuthenticator.withSystem(() -> {
            LocalDateTime dateStart = LocalDateTime.now();
            System.out.println(name+" Запуск регламентной задачи "+ Utils.formatDateTime(dateStart));

            try {
                this.productService.saveTiresByStocksFromWsdl();
            } catch (Exception e) {
                System.out.println(name+" error: "+e.toString());
            }

            LocalDateTime dateEnd = LocalDateTime.now();
            System.out.println(name+" Завершение регламентной задачи "+ Utils.formatDateTime(dateEnd) + " время выполнения "+ ChronoUnit.SECONDS.between(dateStart, dateEnd));
            return "end task";
        });
        System.out.println(name+" "+result);
    }
}
