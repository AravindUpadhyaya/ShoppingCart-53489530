package com.hex.shopec.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.hex.shopec.model.ShoppingCart;
import com.hex.shopec.model.ShoppingCartDetails;

/**
 * 
 * @author 11491
 *
 */
public class ShoppingCartDaoImpl implements ShoppingCartDao {

	@Autowired
	private HibernateTemplate template;

	/**
	 * getTemplate
	 * @return HibernateTemplate
	 */
	public HibernateTemplate getTemplate() {
		return template;
	}

	/**
	 * setTemplate
	 * @param HibernateTemplate
	 */
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	/**
	 * getShoppingCart
	 * @return ShoppingCart
	 */
	@Override
	public ShoppingCart getShoppingCart(Integer p_id) {
		return (ShoppingCart) getTemplate().findByExample("from Shopping_cart cart where cart.id=?" , p_id);
	}

	/**
	 * getShoppingCartDetails
	 * @return ShoppingCartDetails
	 */
	@Override
	public ShoppingCartDetails getShoppingCartDetails(Integer p_id) {
		return (ShoppingCartDetails) getTemplate().findByExample("from Shopping_cart_details cartDetail where cartDetail.id=?" , p_id);
	}

	/**
	 * saveShoppingCart
	 * @param ShoppingCart
	 * @return Integer
	 */
	@Override
	public Integer saveShoppingCart(ShoppingCart p_ShoppingCart) {
		return (Integer) getTemplate().save(p_ShoppingCart);
	}

	/**
	 * saveShoppingCartDetails
	 * @param ShoppingCart
	 * @return Integer
	 */
	@Override
	public Integer saveShoppingCartDetails(ShoppingCart p_ShoppingCartDetails) {
		return (Integer) getTemplate().save(p_ShoppingCartDetails);
	}
}
