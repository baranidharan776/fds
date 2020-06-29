package com.barani.fds.restaurantservice.repo;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.barani.fds.restaurantservice.model.Restaurant;

@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant, Integer>,JpaSpecificationExecutor<Restaurant>  {
	
}
