package com.barani.fds.restaurantservice.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barani.fds.restaurantservice.model.City;
import com.barani.fds.restaurantservice.repo.CityInfoRepository;
import com.barani.fds.restaurantservice.services.CityInfoService;

@Service
public class CityInfoServiceImpl implements CityInfoService {

	@Autowired
	private CityInfoRepository cityRepo;
	
	@Override
	public List<City> findAllCityInfo() {
		return (List<City>) this.cityRepo.findAll();
	}

	@Override
	public Optional<City> findCityById(Integer cityId) {
		return this.cityRepo.findById(cityId);
	}

}
