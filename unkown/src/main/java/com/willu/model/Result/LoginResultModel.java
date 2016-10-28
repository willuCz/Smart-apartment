package com.willu.model.Result;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 登陆结果传出 model
 * @author 赵维禄M
 *
 */
@XmlRootElement
public class LoginResultModel {
	
	/**
	 * 
	 */
	
	public boolean isSuccesss;
	public ErrorMessageModel errorMessageModel;
	
	
	public boolean getSuccesssInfo(){
		return isSuccesss;
	}
	public void setSuccesssInfo(boolean info){
		this.isSuccesss=info;
	}
	
	public ErrorMessageModel getMessageModel(){
		return this.errorMessageModel;
	}
	public void setMessageModel(ErrorMessageModel errorMessageModel){
		this.errorMessageModel = errorMessageModel;
	}
}
