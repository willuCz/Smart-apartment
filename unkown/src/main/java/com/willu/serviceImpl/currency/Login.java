package com.willu.serviceImpl.currency;

import javax.annotation.Resource;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.willu.dao.Tb_userLoginMapper;
import com.willu.model.Tb_userLogin;
import com.willu.model.receive.LoginModel;

@Service("login")
public class Login implements com.willu.serviceI.currency.Login {

	@Resource
	Tb_userLoginMapper tb_userLoginMapper;
	@Override
	public String LoginInUser(LoginModel loginModel,HttpServletRequest request) {
		String result = null;
		Tb_userLogin tb_userLogin = new Tb_userLogin();
		if("1".equals(this.CheckLogin(request))){
			tb_userLogin = tb_userLoginMapper.selectByUserCode(loginModel.getUserCodeInfo());
			if(tb_userLogin!=null){
				if(loginModel.getPasswordInfo().equalsIgnoreCase(tb_userLogin.getPassword())){
					request.getSession().setAttribute("username", tb_userLogin.getUsercode());
					result = "1";
				}
				else{
					result = "128001";
				}
			}
			else {
				result = "128000";
			}

		}
		else{
			result = "128003";
		}
				return result;
	}

	@Override
	public String LoginInManager(LoginModel loginModel, HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String LoginOut(HttpServletRequest request) {
		String result = "128005" ;
		if(request.getSession().getAttribute("username")!=null)
		{
			request.getSession().setAttribute("username",null);
			result = "1";
		}
		return result;
	}

	@Override
	public String CheckLogin(HttpServletRequest request) {
		String result = null ;
		if(request.getSession().getAttribute("username")==null){
			result = "1";
		}
		else{
			result = "128003";
		}
		return result;
	}
	
}
