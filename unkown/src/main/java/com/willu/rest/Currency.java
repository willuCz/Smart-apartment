package com.willu.rest;

import javax.annotation.Resource;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.willu.model.receive.LoginModel;
import com.willu.serviceI.currency.Login;

/**
 * 公共API
 * @author 赵维禄M
 *
 */
@Component
@Path("currency")
public class Currency {
	
	@Resource(name= "login")
	private Login login;
	
	/**
	 * rest测试
	 * @return
	 */
	@GET
	@Path("/test")
	@Produces(MediaType.APPLICATION_JSON)
	public String getTest(){
		return "ok,Manager!";
	}
	
	
	/**
	 * 用户登录
	 * @param loginModel
	 * @param request
	 * @return
	 */
	@GET
	@Path("/login/user")
	@Produces(MediaType.APPLICATION_JSON)
	public String LoginUser(@RequestBody LoginModel loginModel,@Context HttpServletRequest request){	
		String result = null ;
		result = login.LoginInUser(loginModel,request);
		return result;
	}
	/**
	 * 管理员登陆
	 * @param loginModel
	 * @param request
	 * @return
	 */
	@GET
	@Path("/login/manager")
	@Produces(MediaType.APPLICATION_JSON)
	public String LoginManager(@RequestBody LoginModel loginModel,@Context HttpServletRequest request){	
		String result = null ;
		result = login.LoginInManager(loginModel,request);
		return result;
	}
	
	/**
	 * 登出
	 * @param request
	 * @return
	 */
	@GET
	@Path("/login/out")
	@Produces(MediaType.APPLICATION_JSON)
	public String LoginOut(@Context HttpServletRequest request){
		String result = null ;
		result = login.LoginOut(request);
		return result;
	}
	
	/**
	 * 检查登陆
	 * @param request
	 * @return
	 */
	@GET
	@Path("/checklogin")
	@Produces(MediaType.APPLICATION_JSON)
	public String CheckLogin(@Context HttpServletRequest request){
		String result = null ;
		return result ;
	}
}
