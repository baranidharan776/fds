package com.barani.fds.orderservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "InOrder")
public class InOrder {

	@Column(name = "inorder_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer orderId;
	
	@ManyToOne
    @JoinColumn(name = "order_id")
	private CustomerOrder customerOrderId;
    
    
	@Column(name = "menu_item_id")
	private Integer menuItemId;
	
	@Column(name = "offer_id")
	private Integer offerId;
	
	@Column(name = "quantity")
	private Integer quantity;
	
	@Column(name = "item_price")
	private Double itemPrice;
	
	@Column(name = "price")
	private Double totalPrice;
	
	@Column(name = "discount_price")
	private Double discountPrice;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getMenuItemId() {
		return menuItemId;
	}

	public void setMenuItemId(Integer menuItemId) {
		this.menuItemId = menuItemId;
	}

	public Integer getOfferId() {
		return offerId;
	}

	public void setOfferId(Integer offerId) {
		this.offerId = offerId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Double getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(Double discountPrice) {
		this.discountPrice = discountPrice;
	}

	public CustomerOrder getCustomerOrderId() {
		return customerOrderId;
	}

	public void setCustomerOrderId(CustomerOrder customerOrderId) {
		this.customerOrderId = customerOrderId;
	}
	
	
	
}
