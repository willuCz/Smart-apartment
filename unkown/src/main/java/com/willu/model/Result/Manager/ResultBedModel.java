package com.willu.model.Result.Manager;

public class ResultBedModel {
	private String buildingName;
	private int inFloor;
	private int roomNumber;
	private int bedNumber;
	private String position;
	private int state;
	private String bedType;
	private String remark;
	
	public String getBuildingName(){
		return buildingName;
	}
	
	public void setBuildingName(String buildingname){
		this.buildingName = buildingname == null ? null : buildingname.intern();
	}
	
	public int getInFloor(){
		return inFloor;
	}
	
	public void setInFloor(int inFloor){
		this.inFloor = inFloor;
	}
	
	public int getRoomNumber(){
		return roomNumber;
	}
	
	public void setRoomNumber(int roomNumber){
		this.roomNumber = roomNumber;
	}
	
	public int getBedNumber(){
		return bedNumber;
	}
	
	public void setBedNumber(int bedNumber){
		this.bedNumber = bedNumber;
	}
	
	public String getPosition(){
		return position;
	}
	
	public void setPosition(String position){
		this.position = position == null ? null : position.intern();    
	}
	
	public int getState(){
		return state;
	}
	
	public void setState(int state){
		this.state = state;
	}
	
	public String getBedType(){
		return bedType;
	}
	
	public void setBedType(String bedNype){
		this.bedType = bedType == null ? null : bedType.intern();
	}
	
	public String getRemark(){
		return remark;
	}
	
	public void setRemark(String remark){
		this.remark = remark == null ? null : remark.intern();
	}
}
