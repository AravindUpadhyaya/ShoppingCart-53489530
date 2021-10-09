package com.hex.shopec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hex.shopec.dao.UserDao;
import com.hex.shopec.model.User;

/**
 * UserServiceImpl
 * @author 11491
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	public UserDao userDao;

	/**
	 * saveUser
	 * @param User
	 * @return Integer
	 */
	@Override
	public Integer saveUser(User p_User) {
		return userDao.saveUser(p_User);
	}

	/**
	 * login
	 * @param User
	 * @return boolean
	 */
	@Override
	public boolean login(User p_loginUser) {
		return userDao.login(p_loginUser);
	}

}
