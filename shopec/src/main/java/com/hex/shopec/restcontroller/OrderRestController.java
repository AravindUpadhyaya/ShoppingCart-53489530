package com.hex.shopec.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hex.shopec.exception.OrderException;
import com.hex.shopec.model.Order;
import com.hex.shopec.service.OrderService;

/**
 * 
 * OrderRestController
 * @author 11491
 *
 */
@RestController
public class OrderRestController {

	@Autowired
	private OrderService orderService;

	/**
	 * order
	 * @param p_Order
	 * @return Integer
	 * @throws Exception 
	 * @throws OrderException 
	 */
	@RequestMapping(value = "/saveOrder", method = RequestMethod.POST, headers = "Accept=application/json")
	public Integer order(@RequestBody Order p_Order) throws OrderException, Exception {
		return orderService.order(p_Order);
	}
}
