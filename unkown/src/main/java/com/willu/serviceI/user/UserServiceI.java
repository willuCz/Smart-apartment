package com.willu.serviceI.user;

import javax.servlet.http.HttpServletRequest;

import com.willu.model.Result.LoginOutResultModel;
import com.willu.model.Result.LoginResultModel;
import com.willu.model.Result.ModifyPasswordResultModel;
import com.willu.model.receive.LoginModel;
import com.willu.model.receive.ModifyPasswordModel;
/**
 *用户接口类
 * @author 赵维禄M
 *
 */
public interface UserServiceI {
	
	/**
	 * 登陆方法
	 * @param loinModel
	 * @param request
	 * @return
	 */
	public LoginResultModel login(LoginModel loinModel,HttpServletRequest request);
	
	/**
	 * 检测登陆状态
	 * @param request
	 * @return
	 */
	public int checklogin(HttpServletRequest request);
	
	/**
	 * 修改密码
	 * @param modifyPasswordModel
	 * @param request
	 * @return
	 */
	public ModifyPasswordResultModel modifyPassword(ModifyPasswordModel modifyPasswordModel,HttpServletRequest request);
	
	/**
	 * 登出
	 * @param request
	 * @return
	 */
	public LoginOutResultModel loginOut(HttpServletRequest request);
	
	

}