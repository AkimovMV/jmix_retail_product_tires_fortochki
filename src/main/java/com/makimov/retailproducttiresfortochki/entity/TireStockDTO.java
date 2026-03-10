package com.makimov.retailproducttiresfortochki.entity;

import io.jmix.core.metamodel.annotation.JmixEntity;

import java.math.BigDecimal;

@JmixEntity
public class TireStockDTO {
    private String code;

    private String marka;

    private String wrh;

    private BigDecimal price;

    private BigDecimal price_rozn;

    private Integer rest;

    public void setWrh(String wrh) {
        this.wrh = wrh;
    }

    public String getWrh() {
        return wrh;
    }

    public void setPrice_rozn(BigDecimal price_rozn) {
        this.price_rozn = price_rozn;
    }

    public BigDecimal getPrice_rozn() {
        return price_rozn;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Integer getRest() {
        return rest;
    }

    public void setRest(Integer rest) {
        this.rest = rest;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String uniqueKey() {
        return this.getWrh().strip() + this.getMarka().strip() + this.getCode().strip();
    }
}