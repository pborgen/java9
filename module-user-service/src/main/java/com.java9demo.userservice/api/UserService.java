package com.java9demo.userservice.api;
import com.java9demo.userservice.bean.User;

public interface UserService {
	
	public void create(User user);
	public Boolean validate(User user);
	public User get(Integer id);
}