package com.hex.shopec.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.hex.shopec.model.Order;

/**
 * @author 11491
 * OrderDaoImpl
 */
@Repository
public class OrderDaoImpl implements OrderDao {

	@Autowired
	private HibernateTemplate template;

	/**
	 * 
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
	 * Method for saving Order
	 */
	@Override
	public Integer order(Order p_Order) {
		return (Integer) getTemplate().save(p_Order);
	}

}
