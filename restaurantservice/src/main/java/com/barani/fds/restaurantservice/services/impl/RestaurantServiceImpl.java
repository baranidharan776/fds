package com.barani.fds.restaurantservice.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.barani.fds.restaurantservice.model.MenuItem;
import com.barani.fds.restaurantservice.model.Restaurant;
import com.barani.fds.restaurantservice.repo.RestaurantRepository;
import com.barani.fds.restaurantservice.services.RestaurantService;

@Service
public class RestaurantServiceImpl implements RestaurantService {

	@Autowired
    private RestaurantRepository restaurantRepository;
	

    
        
    @Override
    public List<Restaurant> findAllRestaurant() {
        return (List<Restaurant>) this.restaurantRepository.findAll();
    }

    @Override
    public Optional<Restaurant> findRestaurantById(Integer restaurantId) {
        return this.restaurantRepository.findById(restaurantId);
    }

    @Override
    public List<MenuItem> findAllMenuItems(Integer restaurantId) {
    	List<MenuItem> menuItem = null;
    	Optional<Restaurant> restaurant = this.restaurantRepository.findById(restaurantId);
    	if(restaurant != null)
    	{
    		//menuItem = this.menuItemRepository.findAllMenuByRestaurantId(restaurantId);
    	}
		return menuItem;
       
    }

    @Override
    public void createRestaurant(Restaurant restaurant) {
        this.restaurantRepository.save(restaurant);
    }

    @Override
    public void createRestaurants(List<Restaurant> restaurants) {
        this.restaurantRepository.saveAll(restaurants);
    }

	@Override
	public List<Restaurant> searchRestaurant(String name, String ratings, String price, String city) {
		Specification<Restaurant> resSpec = null;
		if(!StringUtils.isEmpty(name))
		{
			resSpec = filterByName(name);
		}
		if(!StringUtils.isEmpty(ratings))
		{
			if(resSpec != null)
				resSpec = resSpec.and(filterByRatings(ratings));
			else
				resSpec = filterByRatings(ratings);
		}
		if(!StringUtils.isEmpty(city))
		{
			if(resSpec != null)
				resSpec = resSpec.and(filterByCity(city));
			else
				resSpec = filterByCity(city);
		}
		if(!StringUtils.isEmpty(price))
		{
			if(resSpec != null)
				resSpec = resSpec.and(filterByPrice(price));
			else
				resSpec = filterByPrice(price);
		}
			return this.restaurantRepository.findAll(resSpec);

	}
	
	 Specification<Restaurant> filterByRatings(String ratings) {
	    return (restaurant, cq, cb) -> cb.equal(restaurant.get("ratings"), ratings);
	}
	
	 Specification<Restaurant> filterByPrice(String price) {
	    return (restaurant, cq, cb) -> cb.equal(restaurant.get("price_level"), price);
	}
	
	 Specification<Restaurant> filterByCity(String city) {
	    return (restaurant, cq, cb) -> cb.equal(restaurant.get("restaurant_city"), city);
	}
	 
	 Specification<Restaurant> filterByName(String name) {
	    return (restaurant, cq, cb) -> cb.like(restaurant.get("restaurant_name"), "%" + name + "%");
	}
}
