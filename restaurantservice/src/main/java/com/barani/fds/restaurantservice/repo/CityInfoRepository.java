package com.barani.fds.restaurantservice.repo;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.barani.fds.restaurantservice.model.City;

@Repository
public interface CityInfoRepository extends CrudRepository<City, Integer>,JpaSpecificationExecutor<City>  {
	
}
