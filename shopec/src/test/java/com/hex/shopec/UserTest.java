package com.hex.shopec;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.hex.shopec.model.User;
import com.hex.shopec.service.UserService;
import com.hex.shopec.service.UserServiceImpl;

/**
 * 
 * @author 11491
 *
 */
public class UserTest {
	
	UserService userService = new UserServiceImpl();
	User user = new User();
	
	/**
	 * When you has a valid email id then set it as valid user
	 */
	@Test
	public void testLogin() {
		user.setEmailAddress("aravindu@hexaware.com");
		assertEquals(userService.login(user), true);
	}
	
	/**
	 * When user object does not have email ID set, then invalid user
	 */
	@Test
	public void testLoginFail() {
		assertEquals(userService.login(user), false);
	}

}
