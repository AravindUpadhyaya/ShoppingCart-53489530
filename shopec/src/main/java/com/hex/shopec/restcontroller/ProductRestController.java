package com.hex.shopec.restcontroller;

import java.util.List;

//CHECKSTYLE:OFF 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hex.shopec.model.Product;
import com.hex.shopec.service.ProductService;

/**
 * 
 * @author 11491
 *
 */
@RestController
public class ProductRestController {

	@Autowired
	private ProductService productService;

	/**
	 * getAllProducts
	 * @return List<Product>
	 */
	@RequestMapping(value = "/products", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Product> getAllProducts() {
		List<Product> products = productService.getAll();
		return products;
	}
}
