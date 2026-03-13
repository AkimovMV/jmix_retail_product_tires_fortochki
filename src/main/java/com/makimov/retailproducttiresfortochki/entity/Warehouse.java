package com.makimov.retailproducttiresfortochki.entity;

import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

@JmixEntity
@Table(name = "WAREHOUSE")
@Entity
public class Warehouse {
    @Column(name = "ID", nullable = false)
    @Id
    private String id;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    @Column(name = "KEY_")
    private String key;

    @InstanceName
    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @Column(name = "DAYS", nullable = false)
    @NotNull
    private Integer days = 0;

    @Column(name = "DELIVERY_DAYS_ADDITIONAL")
    private Integer deliveryDaysAdditional = 0;

    @Column(name = "GET_STOCKS")
    private Boolean getStocks = false;

    @Column(name = "UPLOAD_TO_SITE")
    private Boolean uploadToSite = false;

    @Column(name = "PREPAY")
    private Boolean prepay = false;

    @Column(name = "DELIVERY_ONLY_TO_TERMINAL")
    private Boolean deliveryOnlyToTerminal = false;

    @Column(name = "DELIVERY_DAYS_TOTAL")
    private Integer deliveryDaysTotal = 0;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_UPDATE")
    private Date dateUpdate;

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public Boolean getDeliveryOnlyToTerminal() {
        return deliveryOnlyToTerminal;
    }

    public void setDeliveryOnlyToTerminal(Boolean deliveryOnlyToTerminal) {
        this.deliveryOnlyToTerminal = deliveryOnlyToTerminal;
    }

    public Boolean getPrepay() {
        return prepay;
    }

    public void setPrepay(Boolean prepay) {
        this.prepay = prepay;
    }

    public Boolean getUploadToSite() {
        return uploadToSite;
    }

    public void setUploadToSite(Boolean uploadToSite) {
        this.uploadToSite = uploadToSite;
    }

    public Boolean getGetStocks() {
        if (getStocks != null)
            return getStocks;
        return false;
    }

    public void setGetStocks(Boolean getStocks) {
        this.getStocks = getStocks;
    }

    public Integer getDeliveryDaysTotal() {
        return deliveryDaysTotal;
    }

    public Integer getDeliveryDaysAdditional() {
        return deliveryDaysAdditional;
    }

    public void setDeliveryDaysAdditional(Integer deliveryDaysAdditional) {
        this.deliveryDaysAdditional = deliveryDaysAdditional;
        this.setDeliveryDaysTotalCustom();
    }

    private void setDeliveryDaysTotalCustom(){
        this.deliveryDaysTotal = this.getDays()+this.getDeliveryDaysAdditional();
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
        this.setDeliveryDaysTotalCustom();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private boolean areEqual(Object obj1, Object obj2) {
        // Если оба объекта null — они равны
        if (obj1 == null && obj2 == null) {
            return true;
        }
        // Если только один из объектов null — они не равны
        if (obj1 == null || obj2 == null) {
            return false;
        }
        // В остальных случаях используем стандартный метод equals()
        return obj1.equals(obj2);
    }

    public boolean fillBySource(Warehouse sourceElement){
        if (sourceElement == null) {
            return false;
        }

        boolean hasChanges = false;

        if (!areEqual(this.getName(), sourceElement.getName())) {
            this.setName(sourceElement.getName());
            hasChanges = true;
        }
        if (!areEqual(this.getName(), sourceElement.getName())) {
            this.setName(sourceElement.getName());
            hasChanges = true;
        }
        if (!areEqual(this.getDays(), sourceElement.getDays())) {
            this.setDays(sourceElement.getDays());
            hasChanges = true;
        }
        if (!areEqual(this.getKey(), sourceElement.getKey())) {
            this.setKey(sourceElement.getKey());
            hasChanges = true;
        }

        if (hasChanges) {
            this.setDateUpdate(new Date());
        }

        return hasChanges;
    }
}