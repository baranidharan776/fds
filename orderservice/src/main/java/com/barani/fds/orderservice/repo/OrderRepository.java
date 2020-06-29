package com.barani.fds.orderservice.repo;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.barani.fds.orderservice.model.CustomerOrder;

@Repository
public interface OrderRepository extends CrudRepository<CustomerOrder, Integer>,JpaSpecificationExecutor<CustomerOrder>  {
	
}
