package com.hex.shopec.dao;

import com.hex.shopec.model.ShoppingCart;
import com.hex.shopec.model.ShoppingCartDetails;

/**
 * 
 * @author 11491
 *
 */
public interface ShoppingCartDao {
	public ShoppingCart getShoppingCart(Integer p_id);
	public ShoppingCartDetails getShoppingCartDetails(Integer p_id);
	public Integer saveShoppingCart(ShoppingCart p_ShoppingCart);
	public Integer saveShoppingCartDetails(ShoppingCart p_ShoppingCartDetails);
}
