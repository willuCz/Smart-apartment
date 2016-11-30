package com.willu.model.Result.Manager;

public class ResultBuildingModel {
	private String campusName;
	private String buildingName;
	private String buildingType;
	private int floor;
	public String getCampusName(){
		return campusName;
	}
	
	public void setCampusName(String campusName){
		this.campusName = campusName == null ? null : campusName.intern();
	}
	
	public String getBuildingName(){
		return buildingName;
	}
	
	public void setBuildingName(String buildingName){
		this.buildingName = buildingName == null ? null :buildingName.intern();
	}
	
	public String getBuildingType(){
		return buildingType;
	}
	
	public void setBuildingType(String buildingType){
		this.buildingType = this.buildingType == null ? null : buildingType.intern();
	}
	
	public int getFloor(){
		return floor;
	}
	
	public void setFloor(int floor){
		this.floor = floor;
	}
}

