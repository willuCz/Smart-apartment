package com.willu.model.Result;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 修改密码结果model
 * @author 赵维禄M
 *
 */
@XmlRootElement
public class ModifyPasswordResultModel {
	
	public boolean isSuccess;
	public ErrorMessageModel errorMessageModel;
	
	public boolean getSuccessInfo(){
		return isSuccess;
	}
	public void setSuccessInfo(boolean isSuccess){
		this.isSuccess=isSuccess;
	}
	
	public ErrorMessageModel getMessageModel(){
		return errorMessageModel;
	}
	public void setMessageModel(ErrorMessageModel errorMessageModel){
		this.errorMessageModel = errorMessageModel;
	}
}

