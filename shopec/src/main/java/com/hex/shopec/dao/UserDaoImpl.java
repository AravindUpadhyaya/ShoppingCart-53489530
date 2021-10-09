package com.hex.shopec.dao;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.DetachedCriteria;
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
	 * @return boolean
	 */
	@Override
	public boolean login(User p_loginUser) {
		getTemplate().findByExample("from User user where user.emailAddress=?" , p_loginUser.getEmailAddress());
		return true;
	}

}
