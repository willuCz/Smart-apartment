package com.willu.model.receive;



import javax.xml.bind.annotation.XmlRootElement;

/**
 * 登陆接收model
 * @author 赵维禄M
 *
 */
@XmlRootElement
public class LoginModel {
	
	public String usercode;
	public String password;
	
	public String getUserCodeInfo(){
		return usercode;
	}
	
	public void setUserNameInfo(String usercode){
		this.usercode=usercode;
	}
	
	public String getPasswordInfo(){
		return password;
	}
	public void setPasswordInfo(String password){
		this.password=password ;
	}
}
