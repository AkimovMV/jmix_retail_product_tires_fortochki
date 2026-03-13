package com.makimov.retailproducttiresfortochki.services;

import com.makimov.retailproducttiresfortochki.entity.Warehouse;
import io.jmix.core.DataManager;
import io.jmix.core.SaveContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;

@Service
public class WarehouseService {
    @Autowired
    private DataManager dataManager;

    public void saveWarehouses(List<Warehouse> list) {
        LocalDateTime dateStart = LocalDateTime.now();
        int elementCount = 0;
        System.out.println("saveWarehouses start "+ Utils.formatDateTime(dateStart));

        SaveContext saveContext = new SaveContext().setDiscardSaved(true);
        for (int i = 0; i < list.size(); i++) {
            Warehouse newElement = list.get(i);
            System.out.println("id склад1с "+ newElement.getId());

            Warehouse existingElement = dataManager.load(Warehouse.class).id(newElement.getId()).optional().orElse(dataManager.create(Warehouse.class));
            if (existingElement.getId() != null ) {
                boolean hasChange = existingElement.fillBySource(newElement);
                if (hasChange) {
                    saveContext.saving(existingElement);
                    System.out.println("id  " + existingElement.getId() + " внесены изменения (update)");
                } else {
                    System.out.println("id  " + existingElement.getId() + " изменений нет - запись не произведена");
                }

            } else {
                newElement.setDateUpdate(new Date());
                saveContext.saving(newElement);
                System.out.println("id  " + newElement.getId() + " внесены изменения (insert)");
            }
            // сохранение по 100 позиций
            if ((i + 1) % 100 == 0 || i == list.size() - 1) {
                dataManager.save(saveContext);
                saveContext = new SaveContext().setDiscardSaved(true);
            }
            elementCount++;
        }

        LocalDateTime dateEnd = LocalDateTime.now();
        System.out.println("saveWarehouses end "+ Utils.formatDateTime(dateEnd));
        System.out.println("saveWarehouses time: "+ ChronoUnit.SECONDS.between(dateStart, dateEnd) + " count elements:"+elementCount);
    }
}