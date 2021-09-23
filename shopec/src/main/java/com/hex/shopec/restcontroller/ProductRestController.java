package com.hex.shopec.restcontroller;
//CHECKSTYLE:OFF 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hex.shopec.model.Product;
import com.hex.shopec.service.ProductService;

@RestController
public class ProductRestController {

	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/products", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Product> getAllProducts() {

		List<Product> products = productService.getAll();

  		return products;
	}
}
