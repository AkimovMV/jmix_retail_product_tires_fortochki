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
public class TireStockClearService {
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
}
