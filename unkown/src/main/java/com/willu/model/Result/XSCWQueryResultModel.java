package com.willu.model.Result;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 学生床位查询结果model
 * @author 赵维禄M
 *
 */
@XmlRootElement
public class XSCWQueryResultModel {
	public String studentCode;
	public String studentName;
	public int bedNumber;
	public String roomCode;
	public String floorCode;
	public String buildingCode;
	public ErrorMessageModel errorMessageModel;
	
	public String getStudentCodeInfo(){
		return studentCode;
	}
	public void setStudentCodeInfo(String studentCode){
		this.studentCode=studentCode;
	}
	
	public String getStudentNameInfo(){
		return studentName;
	}
	public void setStudentNameInfo(String studentName){
		this.studentName=studentName;
	}
	
	public int getBedNumberInfo(){
		return bedNumber;
	}
	public void setBedNumInfo(int bedNumber){
		this.bedNumber=bedNumber;
	}
	
	public String getRoomCodeInfo(){
		return roomCode;
	}
	public void setRoomCodeInfo(String roomCode){
		this.roomCode=roomCode;
	}
	
	public String getFloorCodeInfo(){
		return floorCode;
	}
	public void setFloorCodeInfo(String floorCode){
		this.floorCode=floorCode;
	}
	
	public String getBuildingCodeInfo(){
		return buildingCode;
	}
	public void setBuildingCodeInfo(String buildingCode){
		this.buildingCode=buildingCode;
	}
	
	public ErrorMessageModel getMessageModelInfo(){
		return errorMessageModel;
	}
	public void setMessageModelInfo(ErrorMessageModel errorMessageModel){
		this.errorMessageModel = errorMessageModel;
	}
}
