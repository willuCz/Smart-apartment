package com.willu.model.receive.manager;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BuildingModel {
	private String campusName;

    private String name;

    private String type;

    private Integer floors;


    public String getCampusName(){
    	return campusName;
    }
    
    public void setCampusName(String campusName){
    	this.campusName = campusName == null ? null: campusName.trim(); 
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }
}
