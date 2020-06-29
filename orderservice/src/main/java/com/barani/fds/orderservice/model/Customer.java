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
@Table(name = "CUSTOMER")
class Customer{
	
	@Column(name = "customer_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "customer_name")
	private String customerName;
	
	@Column(name = "customer_address")
	private String customerAddress;
	
	@ManyToOne
    @JoinColumn(name = "customer_city")
	private City customerCity;
	
	@Column(name = "customer_phone")
	private String customerPhone;
	
	@Column(name = "customer_email")
	private String customerEmail;
	
	@Column(name = "customer_password")
	private String customerPassword;
	
	@Column(name = "customer_joined")
	private Date customerJoined;
	
	@Column(name = "customer_dob")
	private Date customerDOB;
	
	@OneToMany(cascade = CascadeType.ALL, targetEntity = CustomerOrder.class,
	    		mappedBy = "customer",  fetch=FetchType.LAZY)
	private Set<CustomerOrder> orders;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public City getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(City customerCity) {
		this.customerCity = customerCity;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public Date getCustomerJoined() {
		return customerJoined;
	}

	public void setCustomerJoined(Date customerJoined) {
		this.customerJoined = customerJoined;
	}

	public Date getCustomerDOB() {
		return customerDOB;
	}

	public void setCustomerDOB(Date customerDOB) {
		this.customerDOB = customerDOB;
	}
	
	

	}
