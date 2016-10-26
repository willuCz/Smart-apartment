package com.willu.rest;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import com.willu.model.Result.LoginOutResultModel;
import com.willu.model.Result.LoginResultModel;
import com.willu.model.Result.ModifyPasswordResultModel;
import com.willu.model.Result.SurplusBedQueryResultModel;
import com.willu.model.Result.XSCWQueryResultModel;
import com.willu.model.Result.ZSFPQueryResultModel;
import com.willu.model.receive.LoginModel;
import com.willu.model.receive.ModifyPasswordModel;
import com.willu.model.receive.SurplusBedQueryModel;
import com.willu.model.receive.XSCWQueryModel;
import com.willu.model.receive.ZSFPQueryModel;
import com.willu.serviceImpl.userImpl.*;
@Component    
@Path("user")
public class UserRest {	

	@Resource(name = "userService")
	protected UserServiceImpl userService;	
	
	@GET
    @Path("/test")
    @Produces(MediaType.APPLICATION_JSON)
    public String userTest() {
        return "OK";
    }
	
/*	@Resource(name = "UserService")
	protected UserServiceImpl UserService;
	@GET
	@Path("/add")
	@Produces(MediaType.ALL_VALUE)
	public String addUser() {
	    int result = UserService.addUser();
	    System.out.println("Create user result = " + result);
	    return result==1?"OK2":"ERROR";
    }*/
	
	
	/**
	 * 登陆接口
	 * @param loginModel 处理对象
	 * @param request	
	 * @return LoginResultModel类型
	 */
	
	@POST
	@Path("/login")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@ResponseBody
	public LoginResultModel login(@RequestBody final LoginModel loginModel,@Context HttpServletRequest request){
		LoginResultModel loginResultModel = new LoginResultModel();
		loginResultModel = userService.login(loginModel,request);
	    return loginResultModel;
	}
	
	@GET
	@Path("{username}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@ResponseBody
	public LoginModel login1(@PathParam("username") String username,@PathParam("password") String password, @Context HttpServletRequest request){
		LoginModel loginModel = new LoginModel();
		loginModel.setUserNameInfo(username);
		loginModel.setPasswordInfo(password);
		//loginResultModel = userService.login(loginModel,request);
	    return loginModel;
	}
	
	@GET
	@Path("/login2")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@ResponseBody
	public LoginModel login2(@QueryParam("username") String username,@QueryParam("password") String password, @Context HttpServletRequest request){
		LoginModel loginModel = new LoginModel();
		loginModel.setUserNameInfo(username);
		loginModel.setPasswordInfo(password);
		//loginResultModel = userService.login(loginModel,request);
	    return loginModel;
	}
	
	@POST
	@Path("/login3")
	@Produces(MediaType.APPLICATION_JSON)
	@ResponseBody
	public LoginModel login3(@FormParam("username") String username,@FormParam("password") String password, @Context HttpServletRequest request){
		LoginModel loginModel = new LoginModel();
		loginModel.setUserNameInfo(username);
		loginModel.setPasswordInfo(password);
		//loginResultModel = userService.login(loginModel,request);
	    return loginModel;
	}
	
	/**
	 * 检查登陆状态接口
	 * @param request
	 * @return
	 */
	@GET
	@Path("/checklogin")
	@Produces(MediaType.APPLICATION_JSON)
	@ResponseBody
	public String Checklogin(@Context HttpServletRequest request){
		return Integer.toString(userService.checklogin(request));
	}
	
	/**
	 * 修改密码接口
	 * @param modifyPasswordModel	处理对象
	 * @param request
	 * @return ModifyPasswordResultModel类型
	 */
	@POST
	@Path("/modifypassword")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@ResponseBody
	public ModifyPasswordResultModel modifyPassword(@RequestBody final ModifyPasswordModel modifyPasswordModel,@Context HttpServletRequest request){
		ModifyPasswordResultModel modifyPasswordResultModel = new ModifyPasswordResultModel();
		modifyPasswordResultModel = userService.modifyPassword(modifyPasswordModel, request);
		return modifyPasswordResultModel;
	}
	
	
	/**
	 * 登出接口
	 * @param request
	 * @return LoginOutResultModel类型
	 */
	@GET
	@Path("/loginout")
	@Produces(MediaType.APPLICATION_JSON)
	@ResponseBody
	public LoginOutResultModel loginOut(@Context HttpServletRequest request){
		LoginOutResultModel loginOutResultModel = new LoginOutResultModel();
		loginOutResultModel = userService.loginOut(request);
		return loginOutResultModel;
	}
	
	/**
	 * 剩余床位查询接口
	 * @param surplusBedQueryModel
	 * @return	SurplusBedQueryResultModel类型
	 */
	@POST
	@Path("/sycwquery")
	@Produces(MediaType.APPLICATION_JSON)
	@ResponseBody
	public SurplusBedQueryResultModel sycwQuery(@RequestBody final SurplusBedQueryModel surplusBedQueryModel){
		SurplusBedQueryResultModel surplusBedQueryResultModel = new SurplusBedQueryResultModel();
		return surplusBedQueryResultModel;
	}
	
	/**
	 * 住宿分配查询接口
	 * @param zsfpQueryModel
	 * @return ZSFPQueryResultModel
	 */
	@POST
	@Path("/zsfpquery")
	@Produces(MediaType.APPLICATION_JSON)
	@ResponseBody
	public ZSFPQueryResultModel zsfpQuery(@RequestBody final ZSFPQueryModel zsfpQueryModel){
		ZSFPQueryResultModel zsfpQueryResultModel = new ZSFPQueryResultModel();
		return zsfpQueryResultModel;
	}
	
	/**
	 * 学生床位查询接口
	 * @param xscwQueryModel
	 * @return	XSCWQueryResultModel类型
	 */
	@POST
	@Path("/xscwquery")
	@Produces(MediaType.APPLICATION_JSON)
	@ResponseBody
	public XSCWQueryResultModel xscwQuery(@RequestBody final XSCWQueryModel xscwQueryModel){
		XSCWQueryResultModel xscwQueryResultModel = new XSCWQueryResultModel();
		return xscwQueryResultModel;
	}
}
