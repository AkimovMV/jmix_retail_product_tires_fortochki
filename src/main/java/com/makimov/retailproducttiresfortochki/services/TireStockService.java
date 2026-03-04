package com.makimov.retailproducttiresfortochki.services;

import com.makimov.retailproducttiresfortochki.entity.TireStock;
import com.makimov.retailproducttiresfortochki.entity.TireStockDTO;
import com.makimov.retailproducttiresfortochki.entity.Warehouse;
import io.jmix.core.DataManager;
import io.jmix.core.SaveContext;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
public class TireStockService {
    @Autowired
    private DataManager dataManager;

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void clearTireStock() {
        entityManager
                .createNativeQuery("DELETE FROM TIRE_STOCK")
                .executeUpdate();
    }

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

            if (warehouse.getId() == null) {
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
}
