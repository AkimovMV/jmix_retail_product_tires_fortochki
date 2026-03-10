package com.makimov.retailproducttiresfortochki.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Date;
import java.util.UUID;

@JmixEntity
@Table(name = "TIRE", indexes = {
        @Index(name = "IDX_TIRE_UNQ", columnList = "PRODUCER, PRODUCER_ARTICLE_ID", unique = true)
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

    @Column(name = "WIDTH", nullable = false, length = 10)
    @NotNull
    private String width;

    @NotNull
    @Column(name = "WIDTH_ADDITION", nullable = false, length = 10)
    private String widthAddition;

    @NotNull
    @Column(name = "HEIGHT", nullable = false, length = 10)
    private String height;

    @NotNull
    @Column(name = "HEIGHT_ADDITION", nullable = false, length = 10)
    private String heightAddition;

    @NotNull
    @Column(name = "DIAMETER_OUT", nullable = false, length = 10)
    private String diameterOut;

    @Column(name = "SEASON", nullable = false, length = 20)
    @NotNull
    private String season;

    @Column(name = "SPEED_INDEX", nullable = false, length = 10)
    @NotNull
    private String speedIndex;

    @Column(name = "LOAD_INDEX", nullable = false, length = 10)
    @NotNull
    private String loadIndex;

    @Column(name = "CONSTRUCTION", nullable = false, length = 10)
    @NotNull
    private String construction;

    @Column(name = "LAYER", nullable = false, length = 20)
    @NotNull
    private String layer;

    @Column(name = "AXIS", nullable = false, length = 20)
    @NotNull
    private String axis;

    @Column(name = "THORN", nullable = false)
    @NotNull
    private Boolean thorn = false;

    @Column(name = "THORN_TYPE", nullable = false, length = 30)
    @NotNull
    private String thornType;

    @Column(name = "HOMOLOGATION", nullable = false, length = 30)
    @NotNull
    private String homologation;

    @Column(name = "IMAGE", nullable = false, length = 300)
    @NotNull
    private String image;

    @Column(name = "IMAGE_SMALL", nullable = false, length = 300)
    @NotNull
    private String imageSmall;

    @Column(name = "RUN_FLAT", nullable = false, length = 100)
    @NotNull
    private String runFlat;

    @Column(name = "PROTECTOR_TYPE", nullable = false, length = 50)
    @NotNull
    private String protectorType;

    @Column(name = "TYPE_OF_USE_TRUCK_TIRE", nullable = false, length = 50)
    @NotNull
    private String typeOfUseTruckTire;

    @Column(name = "TECHNOLOGY", nullable = false, length = 30)
    @NotNull
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

}