package com.demo.userService.service;

import javax.inject.Singleton;

import com.demo.userService.model.UserObject;

@Singleton	
public class UserService {

	public UserObject getUser(String userId) {
		
		UserObject user=new UserObject();
		user.setUserId(userId);
		user.setName(userId+"-name");
		return user;
	}
	
	public UserObject createUser(UserObject user) {
		//dummy
		//TODO logic to create a new user in datastore
		return user;
	}
}
