package com.willu.model.Result;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 登出结果model
 * @author 赵维禄M
 *
 */
@XmlRootElement
public class LoginOutResultModel {
	
	
	public boolean isSuccess;
	
	public boolean getSuccessInfo(){
		return isSuccess;
	}
	public void setSuccessInfo(boolean isSuccess){
		this.isSuccess=isSuccess;
	}
}
