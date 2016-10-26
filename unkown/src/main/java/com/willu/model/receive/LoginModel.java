package com.willu.model.receive;


import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 登陆接收model
 * @author 赵维禄M
 *
 */
@XmlRootElement
public class LoginModel {
	
	@FormParam("username")
	public String username;
	@FormParam("password")
	public String password;
	
	public String getUserNameInfo(){
		return username;
	}
	
	public void setUserNameInfo(String username){
		this.username=username;
	}
	
	public String getPasswordInfo(){
		return password;
	}
	public void setPasswordInfo(String password){
		this.password=password ;
	}
}
