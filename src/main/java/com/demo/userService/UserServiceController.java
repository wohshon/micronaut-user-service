package com.demo.userService;

import javax.inject.Inject;

import com.demo.userService.model.UserObject;
import com.demo.userService.service.UserService;
import com.google.gson.Gson;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Consumes;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Produces;

@Controller("/userService") 
public class UserServiceController {

	@Inject
	private UserService userService;
    @Get("/") 
    @Produces(MediaType.TEXT_JSON) 
    public String index() {
    	Gson gson=new Gson();
        return gson.toJson(userService.getUser("1234")); 
    }	

    @Post("/create") 
    @Consumes
    @Produces(MediaType.TEXT_JSON) 
    public String create(@Body UserObject user) {
    	Gson gson=new Gson();
        System.out.println(user.getUserId());
    	return gson.toJson(user); 
    }	
    
		
}
