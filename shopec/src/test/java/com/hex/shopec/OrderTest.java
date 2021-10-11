package com.hex.shopec;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.hex.shopec.exception.OrderException;
import com.hex.shopec.model.Order;
import com.hex.shopec.model.ShoppingCart;
import com.hex.shopec.model.ShoppingCartDetails;
import com.hex.shopec.service.OrderService;
import com.hex.shopec.service.OrderServiceImpl;

public class OrderTest {

	OrderService orderService = new OrderServiceImpl();
	Order order;
	ShoppingCart shoppingCart;
	ShoppingCartDetails shoppingCartdetails;
	Set<ShoppingCartDetails> shoppingCartSet = new HashSet<ShoppingCartDetails>();
	
	@Before
	public void setup() {
		order = new Order();
		order.setOrderdate(java.util.Calendar.getInstance().getTime());
		order.setTotalPrice(Double.valueOf("1500.99"));
		
		shoppingCartdetails = new ShoppingCartDetails();
		shoppingCartdetails.setProductId(12345);
		shoppingCartdetails.setPrice(Double.valueOf("153.50"));
		shoppingCartdetails.setQuantity(3);
		shoppingCartdetails.setShoppingCart(shoppingCart);
		
		shoppingCartSet.add(shoppingCartdetails);
		
		shoppingCartdetails = new ShoppingCartDetails();
		shoppingCartdetails.setProductId(45738);
		shoppingCartdetails.setPrice(Double.valueOf("553.01"));
		shoppingCartdetails.setQuantity(1);
		shoppingCartdetails.setShoppingCart(shoppingCart);
		
		shoppingCartSet.add(shoppingCartdetails);
	}
	
	/**
	 * Positive test for order having shopping cart added to it
	 */
	@Test
	public void testOrder() {
		
		DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");		
		Date date = null;
		try {
			date = df1 .parse("2021-10-15");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		shoppingCart = new ShoppingCart();
		shoppingCart.setExpiry(date);
		shoppingCart.setUserId(11491);
		shoppingCart.setItems(shoppingCartSet);
		
		order.setId(1);
		order.setShoppingCart(shoppingCart);
		
		try {
			assertEquals(orderService.order(order), 1);
			
		} catch (OrderException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Not shopping cart is set to Order
	 */
	@Test
	public void testOrderWithoutShoppingCart() {
		try {
			assertEquals(orderService.order(order), null);
		} catch (OrderException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
