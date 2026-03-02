package com.makimov.retailproducttiresfortochki.entity;

import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

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
    private Integer days;

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
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

        return hasChanges;
    }
}