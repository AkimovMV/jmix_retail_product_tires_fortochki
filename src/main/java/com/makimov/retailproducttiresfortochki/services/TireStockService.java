package com.makimov.retailproducttiresfortochki.services;

import com.makimov.retailproducttiresfortochki.entity.TireStock;
import com.makimov.retailproducttiresfortochki.entity.TireStockDTO;
import com.makimov.retailproducttiresfortochki.entity.Warehouse;
import io.jmix.core.DataManager;
import io.jmix.core.FluentValueLoader;
import io.jmix.core.LoadContext;
import io.jmix.core.SaveContext;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class TireStockService {
    @Autowired
    private DataManager dataManager;

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void saveTireStocks(List<TireStockDTO> list) {
        LocalDateTime dateStart = LocalDateTime.now();
        int elementCount = 0;
        System.out.println("saveTireStocks start "+ Utils.formatDateTime(dateStart));
        int listSize = list.size();
        SaveContext saveContext = new SaveContext().setDiscardSaved(true);
        for (int i = 0; i < listSize; i++) {
            TireStockDTO tireStockDTO = list.get(i);
            System.out.println("id склад "+ tireStockDTO.getWrh() + " шина "+tireStockDTO.getCode() + " " + tireStockDTO.getMarka() );

            String producerArticleId = tireStockDTO.getCode();
            String producer = tireStockDTO.getMarka();

            if (producerArticleId == null || producerArticleId.isEmpty() || producer == null || producer.isEmpty()) {
                continue;
            }

            Warehouse warehouse = dataManager.load(Warehouse.class).id(tireStockDTO.getWrh()).optional().orElse(dataManager.create(Warehouse.class));

            //если склада нет в базе или по складу не отметили брать остатки, то пропустить
            if (warehouse.getId() == null || !(warehouse.getGetStocks())) {
                continue;
            }

            TireStock newElement = dataManager.create(TireStock.class);
            newElement.setWarehouse(warehouse);
            newElement.setProducerArticleId(producerArticleId);
            newElement.setProducer(producer);
            newElement.setCount(tireStockDTO.getRest());
            newElement.setPrice(tireStockDTO.getPrice());
            newElement.setPrice_retail(tireStockDTO.getPrice_rozn());
            saveContext.saving(newElement);

            // сохранение по 100 позиций
            if ((i + 1) % 100 == 0 || i == listSize - 1) {
                dataManager.save(saveContext);
                saveContext = new SaveContext().setDiscardSaved(false);
            }
            elementCount++;
        }

        LocalDateTime dateEnd = LocalDateTime.now();
        System.out.println("saveTireStocks end "+ Utils.formatDateTime(dateEnd));
        System.out.println("saveTireStocks time: "+ ChronoUnit.SECONDS.between(dateStart, dateEnd) + " count elements:"+elementCount);
    }

    public List<String> getCodesWithStocks(){
        List<String> listTireStock = dataManager.loadValue(
                "select distinct tab.producerArticleId from TireStock tab " +
                        "where tab.count > 0 " +
                        "and tab.price_retail > 0.0",String.class)
                .list();
        Set<String> set = new HashSet<>(listTireStock);
        if (set.size() != listTireStock.size()) {
            System.out.println("Количество кодов не совпдаает");
        }
        return listTireStock;
    }

}
