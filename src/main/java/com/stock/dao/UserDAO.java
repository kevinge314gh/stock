package com.stock.dao;

import java.util.List;

import com.stock.model.User;


public interface UserDAO {

	/**
	 * 添加新用户
	 * @param user
	 * @return
	 */
	public int insertUser(User user);
	
	/**
	 * 查询所有用户
	 */
	public List<User> queryAllUser();
	
	
}
