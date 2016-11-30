package com.willu.model.Result;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Building {
	private String campusname;
	private String buildingname;
	private String type;	
	
	public Building(){
		
	}
	public Building(String campusname,String buildingname,String type){
		this.campusname = campusname == null ? null : campusname.intern();
		this.buildingname = buildingname == null ? null :buildingname.intern();
		this.type = type == null ? null : type.intern();
	}
	
	public String getCampusName(){
		return campusname;
	}
	
	public void setCampusName(String campusname){
		this.campusname = campusname == null ? null : campusname.intern();
	}
	
	public String getBuildingName(){
		return buildingname;
	}
	
	public void setBuildingName(String buildingname){
		this.buildingname = buildingname == null ? null : buildingname.intern();
	}
	
	public String getType(){
		return type;
	}
	
	public void setType(String type){
		this.type = type == null ? null :type.intern();
	}
}
