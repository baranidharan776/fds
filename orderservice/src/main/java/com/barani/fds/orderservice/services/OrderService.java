package com.barani.fds.orderservice.services;

import java.util.List;
import java.util.Optional;

import com.barani.fds.orderservice.model.CustomerOrder;

public interface OrderService {

	List<CustomerOrder> findAllCustomerOrders(String customerId);

	Optional<CustomerOrder> findOrderById(Integer orderId);

	void createOrder(CustomerOrder order);

	void cancelOrder(Integer orderId);

	void createOrders(List<CustomerOrder> order);

	
	

}
