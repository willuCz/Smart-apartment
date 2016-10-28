package com.willu.model.receive;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 修改密码传入model
 * @author 赵维禄M
 *
 */
@XmlRootElement
public class ModifyPasswordModel {
	public String oldpassword;
	public String newpassword;
	
	public String getOldPassword(){
		return oldpassword;
	}
	public void setOldPassword(String oldpassword){
		this.oldpassword=oldpassword;
	}
	
	public String getNewPassword(){
		return newpassword;
	}
	public void setNewPassword(String newpassword){
		this.newpassword=newpassword;
	}
}
