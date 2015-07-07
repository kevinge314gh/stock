package com.stock.service;

import java.util.List;

import com.stock.model.User;


public interface UserService {

	public int insertUser(User user);
	
	public List<User> queryAllUser();
}
