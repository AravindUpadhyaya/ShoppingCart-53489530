package com.hex.shopec.dao;


import java.util.List;

import com.hex.shopec.model.Product;

/**
 * @author 11491
 * ProductDao
 */
public interface ProductDao {
	List<Product> findAll();
}
