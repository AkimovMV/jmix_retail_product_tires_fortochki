package com.makimov.retailproducttiresfortochki.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Date;
import java.util.UUID;

@JmixEntity
@Table(name = "TIRE", uniqueConstraints = {
        @UniqueConstraint(name = "IDX_TIRE_UNQ", columnNames = {"PRODUCER", "PRODUCER_ARTICLE_ID"})
})
@Entity
public class Tire {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    @Column(name = "PRODUCER_ARTICLE_ID", nullable = false, length = 50)
    @NotNull
    private String producerArticleId;

    @Column(name = "PRODUCER", nullable = false, length = 50)
    @NotNull
    private String producer;

    @InstanceName
    @Column(name = "NAME", nullable = false, length = 150)
    @NotNull
    private String name;

    @NotNull
    @Column(name = "TIRE_TYPE", nullable = false, length = 20)
    private String tireType;

    @NotNull
    @Column(name = "DIAMETER", length = 10)
    private String diameter;

    @NotNull
    @Column(name = "MODEL", length = 50)
    private String model;

    @Column(name = "WIDTH", length = 10)
    private String width;

    @Column(name = "WIDTH_ADDITION", length = 10)
    private String widthAddition;

    @Column(name = "HEIGHT", length = 10)
    private String height;

    @Column(name = "HEIGHT_ADDITION", length = 10)
    private String heightAddition;

    @Column(name = "DIAMETER_OUT", length = 10)
    private String diameterOut;

    @Column(name = "SEASON", length = 20)
    private String season;

    @Column(name = "SPEED_INDEX", length = 10)
    private String speedIndex;

    @Column(name = "LOAD_INDEX", length = 10)
    private String loadIndex;

    @Column(name = "CONSTRUCTION", length = 10)
    private String construction;

    @Column(name = "LAYER", length = 20)
    private String layer;

    @Column(name = "AXIS", length = 20)
    private String axis;

    @Column(name = "THORN")
    private Boolean thorn = false;

    @Column(name = "THORN_TYPE", length = 30)
    private String thornType;

    @Column(name = "HOMOLOGATION", length = 30)
    private String homologation;

    @Column(name = "IMAGE", length = 300)
    private String image;

    @Column(name = "IMAGE_SMALL", length = 300)
    private String imageSmall;

    @Column(name = "RUN_FLAT", length = 100)
    private String runFlat;

    @Column(name = "PROTECTOR_TYPE", length = 50)
    private String protectorType;

    @Column(name = "TYPE_OF_USE_TRUCK_TIRE", length = 50)
    private String typeOfUseTruckTire;

    @Column(name = "TECHNOLOGY", length = 30)
    private String technology;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_UPDATE")
    private Date dateUpdate;

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getTypeOfUseTruckTire() {
        return typeOfUseTruckTire;
    }

    public void setTypeOfUseTruckTire(String typeOfUseTruckTire) {
        this.typeOfUseTruckTire = typeOfUseTruckTire;
    }

    public String getProtectorType() {
        return protectorType;
    }

    public void setProtectorType(String protectorType) {
        this.protectorType = protectorType;
    }

    public String getRunFlat() {
        return runFlat;
    }

    public void setRunFlat(String runFlat) {
        this.runFlat = runFlat;
    }

    public String getImageSmall() {
        return imageSmall;
    }

    public void setImageSmall(String imageSmall) {
        this.imageSmall = imageSmall;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getHomologation() {
        return homologation;
    }

    public void setHomologation(String homologation) {
        this.homologation = homologation;
    }

    public String getThornType() {
        return thornType;
    }

    public void setThornType(String thornType) {
        this.thornType = thornType;
    }

    public Boolean getThorn() {
        return thorn;
    }

    public void setThorn(Boolean thorn) {
        this.thorn = thorn;
    }

    public String getAxis() {
        return axis;
    }

    public void setAxis(String axis) {
        this.axis = axis;
    }

    public String getLayer() {
        return layer;
    }

    public void setLayer(String layer) {
        this.layer = layer;
    }

    public String getConstruction() {
        return construction;
    }

    public void setConstruction(String construction) {
        this.construction = construction;
    }

    public String getLoadIndex() {
        return loadIndex;
    }

    public void setLoadIndex(String loadIndex) {
        this.loadIndex = loadIndex;
    }

    public String getSpeedIndex() {
        return speedIndex;
    }

    public void setSpeedIndex(String speedIndex) {
        this.speedIndex = speedIndex;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getDiameterOut() {
        return diameterOut;
    }

    public void setDiameterOut(String diameterOut) {
        this.diameterOut = diameterOut;
    }

    public String getHeightAddition() {
        return heightAddition;
    }

    public void setHeightAddition(String heightAddition) {
        this.heightAddition = heightAddition;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidthAddition() {
        return widthAddition;
    }

    public void setWidthAddition(String widthAddition) {
        this.widthAddition = widthAddition;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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

    public boolean fillBySource(TireDTO sourceElement){
        if (sourceElement == null) {
            return false;
        }

        boolean hasChanges = false;

        if (!areEqual(this.getProducerArticleId(), sourceElement.getCode())) {
            this.setProducerArticleId(sourceElement.getCode());
            hasChanges = true;
        }

        if (!areEqual(this.getProducer(), sourceElement.getBrand())) {
            this.setProducer(sourceElement.getBrand());
            hasChanges = true;
        }

        if (!areEqual(this.getName(), sourceElement.getName())) {
            this.setName(sourceElement.getName());
            hasChanges = true;
        }

        if (!areEqual(this.getTireType(), sourceElement.getType())) {
            this.setTireType(sourceElement.getType());
            hasChanges = true;
        }

        if (!areEqual(this.getDiameter(), sourceElement.getDiameter())) {
            this.setDiameter(sourceElement.getDiameter());
            hasChanges = true;
        }

        if (!areEqual(this.getModel(), sourceElement.getModel())) {
            this.setModel(sourceElement.getModel());
            hasChanges = true;
        }

        if (!areEqual(this.getWidth(), sourceElement.getWidth())) {
            this.setWidth(sourceElement.getWidth());
            hasChanges = true;
        }

        if (!areEqual(this.getWidthAddition(), sourceElement.getSubwidth())) {
            this.setWidthAddition(sourceElement.getSubwidth());
            hasChanges = true;
        }

        if (!areEqual(this.getHeight(), sourceElement.getHeight())) {
            this.setHeight(sourceElement.getHeight());
            hasChanges = true;
        }

        if (!areEqual(this.getHeightAddition(), sourceElement.getSubheight())) {
            this.setHeightAddition(sourceElement.getSubheight());
            hasChanges = true;
        }

        if (!areEqual(this.getDiameterOut(), sourceElement.getDiameter_out())) {
            this.setDiameterOut(sourceElement.getDiameter_out());
            hasChanges = true;
        }

        if (!areEqual(this.getSeason(), sourceElement.getSeason())) {
            this.setSeason(sourceElement.getSeason());
            hasChanges = true;
        }

        if (!areEqual(this.getSpeedIndex(), sourceElement.getSpeed_index())) {
            this.setSpeedIndex(sourceElement.getSpeed_index());
            hasChanges = true;
        }

        if (!areEqual(this.getLoadIndex(), sourceElement.getLoad_index())) {
            this.setLoadIndex(sourceElement.getLoad_index());
            hasChanges = true;
        }

        if (!areEqual(this.getConstruction(), sourceElement.getConstr())) {
            this.setConstruction(sourceElement.getConstr());
            hasChanges = true;
        }

        if (!areEqual(this.getLayer(), sourceElement.getSloy())) {
            this.setLayer(sourceElement.getSloy());
            hasChanges = true;
        }

        if (!areEqual(this.getAxis(), sourceElement.getAxle())) {
            this.setAxis(sourceElement.getAxle());
            hasChanges = true;
        }

        if (!areEqual(this.getThorn(), sourceElement.getThorn())) {
            this.setThorn(sourceElement.getThorn());
            hasChanges = true;
        }

        if (!areEqual(this.getThornType(), sourceElement.getThorn_type())) {
            this.setThornType(sourceElement.getThorn_type());
            hasChanges = true;
        }

        if (!areEqual(this.getHomologation(), sourceElement.getOmolog())) {
            this.setHomologation(sourceElement.getOmolog());
            hasChanges = true;
        }

       if (!areEqual(this.getImage(), sourceElement.getImg_big_my())) {
            this.setImage(sourceElement.getImg_big_my());
            hasChanges = true;
        }

        if (!areEqual(this.getImageSmall(), sourceElement.getImg_small())) {
            this.setImageSmall(sourceElement.getImg_small());
            hasChanges = true;
        }

        if (!areEqual(this.getRunFlat(), sourceElement.getPuncture())) {
            this.setRunFlat(sourceElement.getPuncture());
            hasChanges = true;
        }

        if (!areEqual(this.getProtectorType(), sourceElement.getProtector_type())) {
            this.setProtectorType(sourceElement.getProtector_type());
            hasChanges = true;
        }

        if (!areEqual(this.getTypeOfUseTruckTire(), sourceElement.getUse_type())) {
            this.setTypeOfUseTruckTire(sourceElement.getUse_type());
            hasChanges = true;
        }

        if (!areEqual(this.getTechnology(), sourceElement.getTech())) {
            this.setTechnology(sourceElement.getTech());
            hasChanges = true;
        }

        if (hasChanges){
            this.setDateUpdate(new Date());
        }

        return hasChanges;
    }
}