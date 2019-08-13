package com.demo.userService;

import java.util.logging.Logger;

import javax.inject.Inject;

import com.demo.userService.model.UserObject;
import com.demo.userService.service.UserService;
import com.google.gson.Gson;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Consumes;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Produces;

@Controller("/userService") 
public class UserServiceController {

	Logger log=Logger.getLogger(this.getClass().getName());
	
	@Inject
	private UserService userService;
    @Get("/get/{userId}") 
    @Produces(MediaType.TEXT_JSON) 
    public String get(@PathVariable String userId) {
    	Gson gson=new Gson();
        log.info("GET USER: USERID================>"+userId);
        return gson.toJson(userService.getUser(userId)); 
    }	

    @Post("/create") 
    @Consumes
    @Produces(MediaType.TEXT_JSON) 
    public String create(@Body UserObject user) {
    	Gson gson=new Gson();
        log.info("CREATE USER: USERID================>"+user.getUserId());
    	return gson.toJson(userService.createUser(user)); 
    }	
    
		
}
