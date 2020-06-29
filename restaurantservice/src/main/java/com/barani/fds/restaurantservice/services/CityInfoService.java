package com.barani.fds.restaurantservice.services;

import java.util.List;
import java.util.Optional;

import com.barani.fds.restaurantservice.model.City;

public interface CityInfoService {

	List<City> findAllCityInfo();

	Optional<City> findCityById(Integer cityId);

}
