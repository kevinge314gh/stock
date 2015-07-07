package com.stock.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.dao.UserDAO;
import com.stock.model.User;
import com.stock.service.UserService;



@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDAO;
	
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return userDAO.insertUser(user);
	}

}
