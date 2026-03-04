package com.makimov.retailproducttiresfortochki.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@JmixEntity
@Table(name = "TIRE_STOCK", indexes = {
        @Index(name = "IDX_TIRE_STOCK_UNQ", columnList = "WAREHOUSE_ID, PRODUCER_ARTICLE_ID, PRODUCER", unique = true)
})
@Entity
public class TireStock {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @NotNull
    @JoinColumn(name = "WAREHOUSE_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Warehouse warehouse;

    @NotNull
    @Column(name = "PRODUCER_ARTICLE_ID", nullable = false, length = 50)
    private String producerArticleId;

    @Column(name = "PRODUCER", nullable = false, length = 50)
    @NotNull
    private String producer;

    @Min(0)
    @NotNull
    @Column(name = "COUNT_")
    private Integer count;

    @DecimalMin("0")
    @NotNull
    @Column(name = "PRICE", nullable = false)
    private BigDecimal price;

    @DecimalMin("0")
    @NotNull
    @Column(name = "PRICE_RETAIL", nullable = false)
    private BigDecimal price_retail;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_UPDATE")
    private Date dateUpdate;

    public void setPrice_retail(BigDecimal price_retail) {
        this.price_retail = price_retail;
    }

    public BigDecimal getPrice_retail() {
        return price_retail;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getProducerArticleId() {
        return producerArticleId;
    }

    public void setProducerArticleId(String producerArticleId) {
        this.producerArticleId = producerArticleId;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}