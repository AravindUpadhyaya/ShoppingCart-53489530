package com.hex.shopec.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.hex.shopec.model.Product;

/*
 * @author 11491
 * ProductDaoImpl
 */
@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	@Override
	public List<Product> findAll() {
		List<Product> products = getTemplate().loadAll(Product.class);

		for (Product p : products)
			System.out.println(p.toString());

		return products;

	}
}