package com.willu.model.Result;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Room extends Building {
	
	private int floor;
	private int roomnumber;
	private String nature;
	private String typein;
	private int personnumber;
	private String face;
	private BigDecimal prices;
	
	public Room(){
	}
	public Room(String campusname, String buildingname, String type,int floor,int roomnumber,String nature,String typein,int personnumber,String face,BigDecimal prices) {
		super(campusname, buildingname, type);
		this.floor = floor;
		this.roomnumber = roomnumber;
		this.nature = nature == null ? null : nature.intern();
		this.typein = typein == null ? null : typein.intern();
		this.personnumber = personnumber;
		this.face = face == null ? null : face.intern();
		this.prices = prices;
	}
	
	public int getFloor(){
		return floor;
	}
	
	public void setFloor(int floor){
		this.floor = floor;
	}
	
	public int getRoomNumber(){
		return roomnumber;
	}
	
	public void setRoomNumber(int roomnumber){
		this.roomnumber = roomnumber;
	}
	
	public String getNature(){
		return nature;
	}
	
	public void setNature(String nature){
		this.nature = nature == null ? null : nature.intern();
	}
	
	public String getTypeIn(){
		return typein;
	}
	
	public void setTypeIn(String typein){
		this.typein = typein == null ? null : typein.intern();
	}
	
	public int getPersonNumber(){
		return personnumber;
	}
	
	public void setPersonNumber(int personnumber){
		this.personnumber = personnumber;
	}
	
	public String getFace(){
		return face;
	}
	
	public void setFace(String face){
		this.face = face ==null ? null : face.intern();
	}
	
	public BigDecimal getPrices(){
		return prices;
	}
	
	public void setPrices(BigDecimal prices){
		this.prices = prices ;
	}
}
