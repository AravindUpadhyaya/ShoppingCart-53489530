package com.hex.shopec.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hex.shopec.model.User;
import com.hex.shopec.service.UserService;

/**
 * 
 * @author 11491
 *
 */
@RestController
public class UserRestController {

	@Autowired
	private UserService userService;

	/**
	 * saveUser
	 * @param p_User
	 * @return Integer
	 */
	@RequestMapping(value = "/saveUser", method = RequestMethod.POST, headers = "Accept=application/json")
	public Integer saveUser(@RequestBody User p_User) {

		return userService.saveUser(p_User);

	}

	/**
	 * login
	 * @param p_User
	 * @return Boolean
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET, headers = "Accept=application/json")
	public Boolean login(@RequestBody User p_User) {

		return userService.login(p_User);

	}
}
