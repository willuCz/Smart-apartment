package com.willu.serviceI.currency;

import javax.servlet.http.HttpServletRequest;

import com.willu.model.receive.LoginModel;

public interface Login {
	
	public String LoginInUser(LoginModel loginModel,HttpServletRequest request);
	
	public String LoginInManager(LoginModel loginModel,HttpServletRequest request);

	public String LoginOut(HttpServletRequest request);

	public String CheckLogin(HttpServletRequest request);
	
}
