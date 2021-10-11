package com.hex.shopec.exception;

/**
 * Order Exception
 * @author 11491
 *
 */
public class OrderException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OrderException(String p_meString) throws Exception {
		throw new Exception(p_meString);
	}
}
