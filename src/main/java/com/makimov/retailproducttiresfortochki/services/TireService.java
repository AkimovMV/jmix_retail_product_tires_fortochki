package com.makimov.retailproducttiresfortochki.services;

import com.makimov.retailproducttiresfortochki.entity.*;
import io.jmix.core.DataManager;
import io.jmix.core.SaveContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
public class TireService {
    @Autowired
    private DataManager dataManager;

    @Transactional
    public void saveTires(List<TireDTO> list) {
        LocalDateTime dateStart = LocalDateTime.now();
        int elementCount = 0;
        System.out.println("saveTires start "+ Utils.formatDateTime(dateStart));
        int listSize = list.size();
        SaveContext saveContext = new SaveContext().setDiscardSaved(true);
        for (int i = 0; i < listSize; i++) {
            TireDTO tireDTO = list.get(i);
            String producerArticleId = tireDTO.getCode();
            String producer = tireDTO.getBrand();

            System.out.println("id код производителя "+ producerArticleId+ " производитель "+producer);

            if (producerArticleId == null || producerArticleId.isEmpty() || producer == null || producer.isEmpty()) {
                continue;
            }

            Tire tire = dataManager.load(Tire.class)
                                    .query("SELECT tab FROM Tire tab WHERE tab.producerArticleId=:producerArticleId AND tab.producer = :producer")
                                    .parameter("producerArticleId", producerArticleId)
                                    .parameter("producer", producer)
                                    .optional()
                                    .orElse(dataManager.create(Tire.class));
            boolean hasChange = tire.fillBySource(tireDTO);
            if (hasChange) {
                saveContext.saving(tire);
            }

            // сохранение по 100 позиций
            if ((i + 1) % 100 == 0 || i == listSize - 1) {
                dataManager.save(saveContext);
                saveContext = new SaveContext().setDiscardSaved(false);
            }
            elementCount++;
        }

        LocalDateTime dateEnd = LocalDateTime.now();
        System.out.println("saveTires end "+ Utils.formatDateTime(dateEnd));
        System.out.println("saveTires time: "+ ChronoUnit.SECONDS.between(dateStart, dateEnd) + " count elements:"+elementCount);
    }
}