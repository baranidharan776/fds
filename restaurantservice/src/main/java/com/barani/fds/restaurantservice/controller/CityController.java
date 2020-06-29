package com.barani.fds.restaurantservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.barani.fds.restaurantservice.model.City;
import com.barani.fds.restaurantservice.services.CityInfoService;

@RestController
public class CityController {

    private CityInfoService cityInfoService;

    @Autowired
    public CityController(CityInfoService cityInfoService) {
        this.cityInfoService = cityInfoService;
    }


    @RequestMapping(value = "/city", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<City> getAllCityInfo() {
        return this.cityInfoService.findAllCityInfo();
    }

    @RequestMapping(value = "/city/{cityId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Optional<City> getCityById(@PathVariable("cityId") Integer cityId) {
        return this.cityInfoService.findCityById(cityId);
    }

}
