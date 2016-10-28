package com.willu.model.receive;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 学生床位查询传入model
 * @author 赵维禄M
 *
 */
@XmlRootElement
public class XSCWQueryModel {
	
	public String studentCode;
	public String studentName;
	public String buildingCode;
	public String floorCode;
	public String roomCode;
	
	public String getStudentCode(){
		return studentCode;
	}
	public void setStudentCode(String studentCode){
		this.studentCode=studentCode;
	}
	
	public String getStudentName(){
		return studentName;
	}
	public void setStudentName(String studentName){
		this.studentName=studentName;
	}
	
	public String getBuildingCode(){
		return buildingCode;
	}
	public void setBuildingCode(String buildingCode){
		this.buildingCode=buildingCode;
	}
	
	public String getFloorCode(){
		return floorCode;
	}
	public void setFloorCode(String floorCode){
		this.floorCode=floorCode;
	}
	
	public String getRoomCode(){
		return roomCode;
	}
	public void setRoomCode(String roomcode){
		this.roomCode=roomcode;
	}
}
