package com.hex.shopec.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/**
 * 
 * @author 11491
 *
 */
@Entity
@Table(name = "Orders")
@Component
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "deliverytype")
	private String deliveryType;

	private Date orderdate;

	@Column(name = "totalprice")
	private Double totalPrice;

	@Column(name = "products_purchased")
	private Integer productsPurchased;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "shoppingcartid")
	private ShoppingCart shoppingCart;

	public Order() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	public Date getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Integer getProductsPurchased() {
		return productsPurchased;
	}

	public void setProductsPurchased(Integer productsPurchased) {
		this.productsPurchased = productsPurchased;
	}

	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

}
