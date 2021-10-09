package com.hex.shopec.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.hex.shopec.dao.ShoppingCartDao;
import com.hex.shopec.model.ShoppingCart;
import com.hex.shopec.model.ShoppingCartDetails;

/**
 * 
 * @author 11491
 *
 */
public class ShoppingCartService {

	@Autowired
	ShoppingCartDao shoppingCartDao;
	/**
	 * getShoppingCart
	 * @return ShoppingCart
	 */
	public ShoppingCart getShoppingCart(Integer p_id) {
		return shoppingCartDao.getShoppingCart(p_id);
	}
	
	/**
	 * getShoppingCartDetails
	 * @param p_id
	 * @return ShoppingCartDetails
	 */
	public ShoppingCartDetails getShoppingCartDetails(Integer p_id) {
		return shoppingCartDao.getShoppingCartDetails(p_id);
	}
	
	/**
	 * saveShoppingCart
	 * @param ShoppingCart
	 * @return Integer
	 */
	public Integer saveShoppingCart(ShoppingCart p_ShoppingCart) {
		return shoppingCartDao.saveShoppingCart(p_ShoppingCart);
	}

	/**
	 * saveShoppingCartDetails
	 * @param ShoppingCart
	 * @return Integer
	 */
	public Integer saveShoppingCartDetails(ShoppingCart p_ShoppingCartDetails) {
		return shoppingCartDao.saveShoppingCartDetails(p_ShoppingCartDetails);
	}	
}
