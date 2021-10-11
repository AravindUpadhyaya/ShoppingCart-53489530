package com.hex.shopec.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.hex.shopec.model.User;

/*
 * @author 11491
 * UserDaoImpl
 */
@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private HibernateTemplate template;

	/**
	 * @return HibernateTemplate
	 */
	public HibernateTemplate getTemplate() {
		return template;
	}

	/**
	 * 
	 * @param template
	 */
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	/**
	 * saveUser
	 * @param User
	 * @return Integer
	 */
	@Override
	public Integer saveUser(User p_User) {
		return (Integer) getTemplate().save(p_User);
	}

	/**
	 * login
	 * @param User
	 * @return List<User>
	 */
	@Override
	public List<User> login(User p_loginUser) {		
		return getTemplate().findByExample(p_loginUser);
	}

}
