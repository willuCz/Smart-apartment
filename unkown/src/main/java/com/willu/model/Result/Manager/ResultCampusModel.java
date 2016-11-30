package com.willu.model.Result.Manager;
public class ResultCampusModel {
	private String campusName;
	private String campusCode;
	private	String remark;
	
	public String getCampusName(){
		return campusName;
	}
	
	public void setCampusName(String CampusName){
		this.campusName = campusName == null ? null : campusName.intern();
	}
	
	public String getCampusCode(){
		return campusCode;
	}
	
	public void setCampusCode(String campusCode){
		this.campusCode = campusCode == null ? null : campusCode.intern();
	}
	
	public String getRemark(){
		return remark;
	}
	
	public void setRemark(String remark){
		this.remark = remark == null ? null : remark.intern();
	}
}
