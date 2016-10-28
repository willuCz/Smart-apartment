package com.willu.model.Result;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 住宿分配查询结果model
 * @author 赵维禄M
 *
 */
@XmlRootElement
public class ZSFPQueryResultModel {
	public String studentName;
	public String studentCode;
	public String floorCode;
	public String roomCode;
	public int bedNumber;
	public PageModel pageModel;
	public ErrorMessageModel errorMessageModel;
	
	public String getStudentNameInfo(){
		return studentCode;
	}
	public void setStudentNameInfo(String studentName){
		this.studentCode=studentName;
	}
	
	public String getStudentCodeInfo(){
		return studentCode;
	}
	public void setStudentCodeInfo(String studentCode){
		this.studentCode=studentCode;
	}
	
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
	
	public int getBedNumberInfo(){
		return bedNumber;
	}
	public void setBedNumberInfo(int bedNumber){
		this.bedNumber=bedNumber;
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
	public void setMessageInfo(ErrorMessageModel errorMessageModel){
		this.errorMessageModel = errorMessageModel ;
	}
}
