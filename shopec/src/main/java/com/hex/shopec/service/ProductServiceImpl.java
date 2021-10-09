package com.hex.shopec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hex.shopec.dao.ProductDao;
import com.hex.shopec.model.Product;

/**
 * ProductServiceImpl
 * @author 11491
 *
 */
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;

	
	/**
	 * getAll
	 * @return List<Product>
	 */
	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return productDao.findAll();
	}

}
