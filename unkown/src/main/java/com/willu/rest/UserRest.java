package com.willu.rest;

import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

/**
 * 用户API
 * @author 赵维禄M
 *
 */
@Component    
@Path("user")
public class UserRest {	
	
	
	@GET
    @Path("/test")
    @Produces(MediaType.APPLICATION_JSON)
    public String userTest() {
        return "OK";
    }
	
}
