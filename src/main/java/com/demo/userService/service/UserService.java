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
}
