package com.java9demo.userservice.service;
import com.java9demo.userservice.bean.User;
import com.java9demo.userservice.api.UserService;

public class UserServiceImpl implements UserService {
	
	public void create(User user) {

	}
	
	public Boolean validate(User user) {
		return true;
	}

	public User get(Integer id) {
		User user = new User();
		user.setUsername("MyUsername");
		user.setFirstname("MyFirstname");
		user.setLastname("MyLastname");

		return user;
	}
}