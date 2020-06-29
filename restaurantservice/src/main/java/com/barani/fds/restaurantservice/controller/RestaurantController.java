package com.barani.fds.restaurantservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.barani.fds.restaurantservice.model.MenuItem;
import com.barani.fds.restaurantservice.model.Restaurant;
import com.barani.fds.restaurantservice.services.RestaurantService;

import java.util.List;
import java.util.Optional;


@RestController
public class RestaurantController {

    private RestaurantService restaurantService;

    @Autowired
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }


    @RequestMapping(value = "/restaurants", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Restaurant> getAllRestaurant() {
        return this.restaurantService.findAllRestaurant();
    }


    @RequestMapping(value = "/restaurant", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Restaurant> searchRestaurant(@RequestParam(value = "name") String name,
    		@RequestParam(value="ratings") String ratings, @RequestParam(value="price") String price, @RequestParam(value="city") String city) {
        return this.restaurantService.searchRestaurant(name,ratings,price,city);
    }
    

    @RequestMapping(value = "/restaurant/{restaurantId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Optional<Restaurant> getRestaurantById(@PathVariable("restaurantId") Integer restaurantId) {
        return this.restaurantService.findRestaurantById(restaurantId);
    }


    @RequestMapping(value = "/restaurant/{restaurantId}/items", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<MenuItem> getAllMenuItems(@PathVariable("restaurantId") Integer restaurantId) {
        return this.restaurantService.findAllMenuItems(restaurantId);
    }


    @RequestMapping(value = "/restaurant", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void createRestaurant(@RequestBody Restaurant restaurant) {
        this.restaurantService.createRestaurant(restaurant);
    }


    @RequestMapping(value = "/restaurants", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void createRestaurants(@RequestBody List<Restaurant> restaurants) {
        this.restaurantService.createRestaurants(restaurants);
    }
}
