package com.niit.dao;

import java.util.List;

import com.niit.model.User;

public interface UserDao 
{
	public void registerUser(User user);
	
	boolean isEmailUnique (String email);
	
	User login(User user);
	
	public void update(User validUser);

	User getUser(String email);
	
	void updateUser(User user);
	
	List<User> searchUser(String name);
}
