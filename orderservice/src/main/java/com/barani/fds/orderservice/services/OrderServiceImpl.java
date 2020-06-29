package com.barani.fds.orderservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.barani.fds.orderservice.model.CustomerOrder;
import com.barani.fds.orderservice.repo.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public List<CustomerOrder> findAllCustomerOrders(String customerId) {
		return this.orderRepository.findAll(filterByCustomerId(customerId));
	}

	@Override
	public Optional<CustomerOrder> findOrderById(Integer orderId) {
		return this.orderRepository.findById(orderId);
	}

	@Override
	public void createOrder(CustomerOrder order) {
		 this.orderRepository.save(order);

	}

	@Override
	public void cancelOrder(Integer orderId) {
		Optional<CustomerOrder> customerOrder = this.orderRepository.findById(orderId);
		if(customerOrder.isPresent())
		{
			customerOrder.get().setStatus("Cancel");
			this.orderRepository.save(customerOrder.get());
		}

	}

	@Override
	public void createOrders(List<CustomerOrder> order) {
		this.orderRepository.saveAll(order);

	}

	Specification<CustomerOrder> filterByCustomerId(String customerId) {
	    return (order, cq, cb) -> cb.equal(order.get("customer_id"), customerId);
	}
}
