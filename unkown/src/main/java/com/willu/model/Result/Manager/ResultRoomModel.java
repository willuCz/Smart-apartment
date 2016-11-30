package com.willu.model.Result.Manager;

import java.math.BigDecimal;


public class ResultRoomModel {
	private String buildingName;
	private int inFloor;
	private int roomNumber;
	private String nature;
	private String roomType;
	private int person;
	private String face;
	private BigDecimal prices;
	
	public String getBuildingName(){
		return buildingName;
	}
	
	public void setBuildingName(String buildingName){
		this.buildingName = buildingName == null ? null : buildingName.intern();
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
	
	public String getNature(){
		return nature;
	}
	
	public void setNature(String nature){
		this.nature = nature == null ? null : nature.intern();
	}
	
	public String getRoomType(){
		return roomType;
	}
	
	public void setRoomType(String roomType){
		this.roomType = roomType ==null ? null : roomType.intern();
	}
	
	public int getPerson(){
		return person;
	}
	
	public void setPerson(int person){
		this.person = person;
	}
	
	public String getFace(){
		return face;
	}
	
	public void setFace(String face){
		this.face = face == null ? null : face.intern();
	}
	
	public BigDecimal getPrices(){
		return prices;
	}
	
	public void setPrices(BigDecimal prices){
		this.prices = prices;
	}
}
