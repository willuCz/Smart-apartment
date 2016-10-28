package com.willu.model.Result;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 剩余床位查询结果model
 * @author 赵维禄M
 *
 */
@XmlRootElement
public class SurplusBedQueryResultModel {
	public String floorCode;
	public String roomCode;
	public String surplusBed;
	public PageModel pageModel;
	public ErrorMessageModel errorMessageModel;
	
	public String getFloorCodeInfo(){
		return floorCode;
	}
	public void setFloorCodeInfo(String floorCode){
		this.floorCode=floorCode;
	}
	
	public String getRoomCodeInfo(){
		return roomCode;
	}
	public void setRoomCodeInfo(String roomCode){
		this.roomCode=roomCode;
	}
	
	public String getSurplusBedInfo(){
		return surplusBed;
	}
	public void setSurplusBedInfo(String surplusBed){
		this.surplusBed=surplusBed;
	}
	
	public PageModel getPageModelInfo(){
		return pageModel;
	}
	public void setPageModelInfo(PageModel pageModel){
		this.pageModel=pageModel;
	}
	
	public ErrorMessageModel getMessageModelInfo(){
		return errorMessageModel;
	}
	public void setMessageModelInfo(ErrorMessageModel errorMessageModel){
		this.errorMessageModel = errorMessageModel;
	}
}
