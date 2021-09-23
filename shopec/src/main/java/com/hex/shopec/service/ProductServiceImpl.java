package com.hex.shopec.service;
//CHECKSTYLE:OFF 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.hex.shopec.model.Product;
import com.hex.shopec.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return productDao.findAll();
	}

}
