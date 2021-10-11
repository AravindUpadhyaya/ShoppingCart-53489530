package com.hex.shopec.service;

import java.util.List;

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
		if (null == p_loginUser.getEmailAddress()) {
			return false;
		}
		List<User> userList = userDao.login(p_loginUser);
		return null != userList && !userList.isEmpty();
	}

}
