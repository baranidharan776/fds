package com.barani.fds.orderservice.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER_ORDER")
public class CustomerOrder {

	@Column(name = "order_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "restaurant_id")
	private Integer restaurantId;
	
	@Column(name = "ect")
	private Date eta;
	
	@Column(name = "delivery_address")
	private String deleiveryAddress;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	@Column(name = "price")
	private Double price;
	
	@Column(name = "discount")
	private Double discount;
	
	@Column(name = "final_amount")
	private Double finalAmount;
	
	@Column(name = "status")
	private String status = "active";
	
	 @OneToMany(cascade = CascadeType.ALL, targetEntity = InOrder.class,
	    		mappedBy = "customerOrderId",  fetch=FetchType.LAZY)
	private Set<InOrder> orderItems;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}

	public Date getEta() {
		return eta;
	}

	public void setEta(Date eta) {
		this.eta = eta;
	}

	public String getDeleiveryAddress() {
		return deleiveryAddress;
	}

	public void setDeleiveryAddress(String deleiveryAddress) {
		this.deleiveryAddress = deleiveryAddress;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Double getFinalAmount() {
		return finalAmount;
	}

	public void setFinalAmount(Double finalAmount) {
		this.finalAmount = finalAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set<InOrder> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(Set<InOrder> orderItems) {
		this.orderItems = orderItems;
	}
	
	
}
