package com.hex.shopec.dao;
//CHECKSTYLE:OFF 
import java.util.List;

import com.hex.shopec.model.Product;

public interface ProductDao {
  List<Product> findAll();
}
