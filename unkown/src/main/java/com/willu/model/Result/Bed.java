package com.willu.model.Result;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Bed extends Room {

	private int number;
	private String position;
	private String state;
	private String bedtype;
	private String remark;
	public Bed(String campusname, String buildingname, String type, int floor, int roomnumber, String nature,
			String typein, int personnumber, String face, BigDecimal prices,int number,String position,String state,String bedtype,String remark) {
		super(campusname, buildingname, type, floor, roomnumber, nature, typein, personnumber, face, prices);
		this.number = number;
		this.position = position == null ? null : position.intern();
		this.state = state == null ? null : state.intern();
		this.bedtype = bedtype == null ? null : bedtype.intern();
		this.remark = remark == null ? null : bedtype.intern();
	}
	
	public int getNumber(){
		return number;
	}
	
	public void setNumber(int number){
		this.number = number;
	}
	
	public String getPosition(){
		return position ;
	}
	
	public void setPosition(String position){
		this.position = position == null ? null : position.intern();
	}
	
	public String getState(){
		return state;
	}
	
	public void setState(String state){
		this.state = state ==null ? null : state.intern();
	}
	
	public String getBedType(){
		return bedtype;
	}
	
	public void setBedType(String bedtype){
		this.bedtype = bedtype == null ? null : bedtype.intern();
	}
	
	public String getRemark(){
		return remark;
	}
	
	public void setRemark(String remark){
		this.remark = remark ==null ? null : remark.intern();
	}
}
