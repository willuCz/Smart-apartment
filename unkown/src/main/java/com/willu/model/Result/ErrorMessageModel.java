package com.willu.model.Result;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 错误信息model
 * @author 赵维禄M
 *
 */
@XmlRootElement
public class ErrorMessageModel {
	
	/**
	 * value 表示错误编号
	 * message 表示错误信息
	 */
	
	public int value;
	public String message;
	
	public int getValueInfo(){
		return value;
	}
	public void setValueInfo(int value){
		this.value=value;
	}
	
	public String getMessageInfo(){
		return message;
	}
	public void setMessageInfo(String message){
		this.message=message;
	}
}
