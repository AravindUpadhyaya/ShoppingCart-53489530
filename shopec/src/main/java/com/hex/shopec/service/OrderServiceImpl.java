package com.hex.shopec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hex.shopec.dao.OrderDao;
import com.hex.shopec.exception.OrderException;
import com.hex.shopec.model.Order;

/**
 * 
 * @author 11491
 *
 */
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDao orderDao;

	/**
	 * order
	 * @param Order
	 * @return Integer
	 * @throws Exception 
	 * @throws OrderException 
	 */
	@Override
	public Integer order(Order p_Order) throws OrderException, Exception {
		if(null == p_Order || null == p_Order.getShoppingCart()) {
			throw new OrderException("No items added in Shopping cart");
		}
		return orderDao.order(p_Order);
	}

}
