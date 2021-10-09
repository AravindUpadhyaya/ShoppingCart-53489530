package com.hex.shopec.service;

import org.springframework.stereotype.Service;

import com.hex.shopec.model.User;

/**
 * 
 * @author 11491
 *
 */
@Service
public interface UserService {
	public Integer saveUser(User p_User);
	public boolean login(User p_loginUser);
}
