package com.barani.fds.restaurantservice.services;

import java.util.List;
import java.util.Optional;

import com.barani.fds.restaurantservice.model.MenuItem;
import com.barani.fds.restaurantservice.model.Restaurant;



public interface RestaurantService {

	List<Restaurant> findAllRestaurant();

	Optional<Restaurant> findRestaurantById(Integer restaurantId);

	List<MenuItem> findAllMenuItems(Integer restaurantId);

	void createRestaurant(Restaurant restaurant);

	void createRestaurants(List<Restaurant> restaurants);

	List<Restaurant> searchRestaurant(String name, String ratings, String price, String city);


	

}
