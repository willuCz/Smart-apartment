package com.willu.model.receive;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 剩余床位查询传入model
 * @author 赵维禄M
 *
 */
@XmlRootElement
public class SurplusBedQueryModel {
	
	public String buildingCode;
	public String floorCode;
	public String roomCode;
	public int	pageVL;
	public int  pageNum;
	
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
	
	public int getPageVL(){
		return pageNum;
	}
	public void setPageVL(int pageVL){
		this.pageNum=pageVL;
	}
	
	public int getPageNum(){
		return pageNum;
	}
	public void setPageNum(int pageNum){
		this.pageNum=pageNum;
	}
}
