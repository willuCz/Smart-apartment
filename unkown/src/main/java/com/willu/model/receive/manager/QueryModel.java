package com.willu.model.receive.manager;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class QueryModel {
	
	private String campusName;
	
    private String  buildingName;

    private Integer  floorNumber;

    private Integer roomNumber;

    private Integer bedNumber;
    
    public String getCampusName() {
        return campusName;
    }

    public void setCampusName(String campusName) {
        this.campusName = campusName == null ? null : campusName.intern();
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName == null ? null : buildingName.intern();
    }

    public Integer getFloorNumber() {
        return floorNumber;
    }

    public void setFloornumber(Integer floornumber) {
        this.floorNumber = floornumber;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomnumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }
    
    public Integer getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(Integer bedNumber) {
        this.bedNumber = bedNumber;
    }

}
