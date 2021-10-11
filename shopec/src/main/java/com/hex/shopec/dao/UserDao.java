package com.hex.shopec.dao;

import java.util.List;

import com.hex.shopec.model.User;

/**
 * @author 11491
 * UserDao
 */
public interface UserDao {	
	public Integer saveUser(User p_User);
	public List<User> login(User p_loginUser);
}
