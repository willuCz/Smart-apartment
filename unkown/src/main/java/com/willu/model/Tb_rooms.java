package com.willu.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Tb_rooms {
    private Integer id;

    private Integer buildingid;

    private Integer floornumber;

    private Integer roomnumber;

    private String nature;

    private String type;

    private Integer personnumber;

    private String face;

    private BigDecimal prices;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBuildingid() {
        return buildingid;
    }

    public void setBuildingid(Integer buildingid) {
        this.buildingid = buildingid;
    }

    public Integer getFloornumber() {
        return floornumber;
    }

    public void setFloornumber(Integer floornumber) {
        this.floornumber = floornumber;
    }

    public Integer getRoomnumber() {
        return roomnumber;
    }

    public void setRoomnumber(Integer roomnumber) {
        this.roomnumber = roomnumber;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature == null ? null : nature.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getPersonnumber() {
        return personnumber;
    }

    public void setPersonnumber(Integer personnumber) {
        this.personnumber = personnumber;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face == null ? null : face.trim();
    }

    public BigDecimal getPrices() {
        return prices;
    }

    public void setPrices(BigDecimal prices) {
        this.prices = prices;
    }
}