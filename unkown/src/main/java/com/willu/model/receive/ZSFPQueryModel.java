package com.willu.model.receive;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 住宿分配查询传入model
 * @author 赵维禄M
 *
 */
@XmlRootElement
public class ZSFPQueryModel {
	
	public String buildingCode;
	public String floorCode;
	public String roomCode;
	
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
	public void setRoomCode(String roomCode){
		this.roomCode=roomCode;
	}
}
