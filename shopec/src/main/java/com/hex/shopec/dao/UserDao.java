package com.hex.shopec.dao;

import com.hex.shopec.model.User;

/**
 * @author 11491
 * UserDao
 */
public interface UserDao {	
	public Integer saveUser(User p_User);
	public boolean login(User p_loginUser);
}
