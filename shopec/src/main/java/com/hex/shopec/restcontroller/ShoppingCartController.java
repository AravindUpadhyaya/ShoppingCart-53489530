package com.hex.shopec.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hex.shopec.model.ShoppingCart;
import com.hex.shopec.model.ShoppingCartDetails;
import com.hex.shopec.service.ShoppingCartService;

/**
 * 
 * @author 11491
 *
 */
public class ShoppingCartController {

	@Autowired
	ShoppingCartService shoppingCart;
	
	/**
	 * getShoppingCart
	 * @return ShoppingCart
	 */
	@RequestMapping(value = "/getShoppingCart", method = RequestMethod.GET, headers = "Accept=application/json")
	public ShoppingCart getShoppingCart(Integer p_id) {
		return shoppingCart.getShoppingCart(p_id);
	}
	
	/**
	 * getShoppingCart
	 * @return ShoppingCart
	 */
	@RequestMapping(value = "/getShoppingCartDetails", method = RequestMethod.GET, headers = "Accept=application/json")
	public ShoppingCartDetails getShoppingCartDetails(Integer p_id) {
		return shoppingCart.getShoppingCartDetails(p_id);
	}
	
	/**
	 * saveShoppingCart
	 * @param p_ShoppingCart
	 * @return Integer
	 */
	@RequestMapping(value = "/saveShoppingCart", method = RequestMethod.POST, headers = "Accept=application/json")
	public Integer saveShoppingCart(ShoppingCart p_ShoppingCart) {
		return shoppingCart.saveShoppingCart(p_ShoppingCart);
	}
	
	/**
	 * saveShoppingCartDetails
	 * @param ShoppingCart
	 * @return Integer
	 */
	@RequestMapping(value = "/saveShoppingCartDetails", method = RequestMethod.POST, headers = "Accept=application/json")
	public Integer saveShoppingCartDetails(ShoppingCart p_ShoppingCartDetails) {
		return shoppingCart.saveShoppingCartDetails(p_ShoppingCartDetails);
	}
}