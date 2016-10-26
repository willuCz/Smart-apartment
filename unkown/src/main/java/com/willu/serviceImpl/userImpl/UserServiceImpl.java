package com.willu.serviceImpl.userImpl;

import javax.annotation.Resource;



import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;
import com.willu.dao.tb_userMapper;
import com.willu.model.tb_user;
import com.willu.model.Result.ErrorMessageModel;
import com.willu.model.Result.LoginOutResultModel;
import com.willu.model.Result.LoginResultModel;
import com.willu.model.Result.ModifyPasswordResultModel;
import com.willu.model.receive.LoginModel;
import com.willu.model.receive.ModifyPasswordModel;
import com.willu.serviceI.user.UserServiceI;

/**
 * 
 * @author 赵维禄M
 *
 */
@Service("userService")
public class UserServiceImpl implements UserServiceI {
	
	ErrorMessageModel errorMessage;
	@Resource
	tb_userMapper tb_userMapper;
	@Override
	/*
	 * (non-Javadoc)
	 * @see com.willu.serviceI.user.UserServiceI#login(com.willu.model.receive.LoginModel)
	 */
	public LoginResultModel login(LoginModel loginModel,HttpServletRequest request){
		LoginResultModel login =new LoginResultModel();
		if(checklogin(request)!=1){
			tb_user tb_user = new tb_user();
			String username = loginModel.getUserNameInfo();
			String password = loginModel.getPasswordInfo();
			tb_user = tb_userMapper.selectByUsername(username);
			if(tb_user!=null&&username!=null){
				System.out.println(password+","+tb_user.getUsername());
				if(loginModel.getPasswordInfo().equals(tb_user.getPassword())){
					request.getSession().setAttribute("username", tb_user.getUsername());
					login.setSuccesssInfo(true);
					errorMessage=null;
					login.setMessageModel(errorMessage);
				}
				else {
					login.setSuccesssInfo(false);
					errorMessage=new ErrorMessageModel();
					errorMessage.setValueInfo(0);
					errorMessage.setMessageInfo("密码错误");
				}
			}
			else {
				login.setSuccesssInfo(false);
				errorMessage =new ErrorMessageModel();
				errorMessage.setValueInfo(1);
				errorMessage.setMessageInfo("用户不存在！");
				login.setMessageModel(errorMessage);
			}
		
		}
		else{
			login.setSuccesssInfo(false);
			errorMessage = new ErrorMessageModel();
			errorMessage.setValueInfo(2);
			errorMessage.setMessageInfo("用户已经登陆！");
			login.setMessageModel(errorMessage);
		}
		return login;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.willu.serviceI.user.UserServiceI#checklogin(javax.servlet.http.HttpServletRequest)
	 */
	@Override
	public int checklogin(HttpServletRequest request) {
		int result = 0;
		if(request.getSession().getAttribute("username")!=null){
			result=1;
		}
		System.out.println(request.getSession().getAttribute("username"));
		return result;
	}
	
	@Override
	public ModifyPasswordResultModel modifyPassword(ModifyPasswordModel modifyPasswordModel,HttpServletRequest request) {
		ModifyPasswordResultModel modify = new ModifyPasswordResultModel();
		String username = (String) request.getSession().getAttribute("username");
		if(modifyPasswordModel.getOldPassword().equals(tb_userMapper.selectByUsername(username).getPassword())){
			tb_user tb_user = new tb_user();
			tb_user.setPassword(modifyPasswordModel.getNewPassword());
			tb_user.setUsername(username);
			tb_user.setId(tb_userMapper.selectByUsername(username).getId());
			tb_userMapper.updateByPrimaryKeySelective(tb_user);
			modify.setSuccessInfo(true);
			errorMessage = null;
			modify.setMessageModel(errorMessage);
		}
		else{
			modify.setSuccessInfo(false);
			errorMessage =new ErrorMessageModel();
			errorMessage.setValueInfo(3);
			errorMessage.setMessageInfo("旧密码错误！");
			modify.setMessageModel(errorMessage);
		}
		return modify;
	}
	
	
	@Override
	public LoginOutResultModel loginOut(HttpServletRequest request) {
		LoginOutResultModel loginOut = new LoginOutResultModel();
		request.getSession().setAttribute("username", null);
		loginOut.setSuccessInfo(true);
		return loginOut;
	}

}
