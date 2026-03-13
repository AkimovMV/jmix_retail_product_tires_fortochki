package com.makimov.retailproducttiresfortochki.entity;

import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.JmixProperty;
import jakarta.validation.constraints.NotNull;

@JmixEntity
public class TireDTO {
    @JmixProperty(mandatory = true)
    @NotNull
    private String code;

    @InstanceName
    private String name;

    private String type;

    @JmixProperty(mandatory = true)
    @NotNull
    private String brand;

    private String model = "";

    private String diameter = "";

    private String diameter_out = "";

    private String season = "";

    private String width = "";

    private String subwidth = "";

    private String height = "";

    private String subheight = "";

    private String load_index = "";

    private String speed_index = "";

    private Boolean thorn = false;

    private String constr = "";

    private String sloy = "";

    private String axle = "";

    private String img_big_my = "";

    private String img_small = "";

    private String omolog = "";

    private String puncture = "";

    private String thorn_type = "";

    private String tech = "";

    private String protector_type = "";

    private String use_type = "";

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getUse_type() {
        return use_type;
    }

    public void setUse_type(String use_type) {
        this.use_type = use_type;
    }

    public String getProtector_type() {
        return protector_type;
    }

    public void setProtector_type(String protector_type) {
        this.protector_type = protector_type;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public String getThorn_type() {
        return thorn_type;
    }

    public void setThorn_type(String thorn_type) {
        this.thorn_type = thorn_type;
    }

    public String getPuncture() {
        return puncture;
    }

    public void setPuncture(String puncture) {
        this.puncture = puncture;
    }

    public String getOmolog() {
        return omolog;
    }

    public void setOmolog(String omolog) {
        this.omolog = omolog;
    }

    public String getImg_small() {
        return img_small;
    }

    public void setImg_small(String img_small) {
        this.img_small = img_small;
    }

    public String getImg_big_my() {
        return img_big_my;
    }

    public void setImg_big_my(String img_big_my) {
        this.img_big_my = img_big_my;
    }

    public String getAxle() {
        return axle;
    }

    public void setAxle(String axle) {
        this.axle = axle;
    }

    public String getSloy() {
        return sloy;
    }

    public void setSloy(String sloy) {
        this.sloy = sloy;
    }

    public String getConstr() {
        return constr;
    }

    public void setConstr(String constr) {
        this.constr = constr;
    }

    public Boolean getThorn() {
        return thorn;
    }

    public void setThorn(Boolean thorn) {
        this.thorn = thorn;
    }

    public String getSpeed_index() {
        return speed_index;
    }

    public void setSpeed_index(String speed_index) {
        this.speed_index = speed_index;
    }

    public String getLoad_index() {
        return load_index;
    }

    public void setLoad_index(String load_index) {
        this.load_index = load_index;
    }

    public String getSubheight() {
        return subheight;
    }

    public void setSubheight(String subheight) {
        this.subheight = subheight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getSubwidth() {
        return subwidth;
    }

    public void setSubwidth(String subwidth) {
        this.subwidth = subwidth;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getDiameter_out() {
        return diameter_out;
    }

    public void setDiameter_out(String diameter_out) {
        this.diameter_out = diameter_out;
    }

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}