package com.hex.shopec.service;

import org.springframework.stereotype.Service;

import com.hex.shopec.exception.OrderException;
import com.hex.shopec.model.Order;

/**
 * 
 * @author 11491
 *
 */
@Service
public interface OrderService {
	public Integer order(Order p_Order) throws OrderException, Exception;
}
