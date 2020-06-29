package com.barani.fds.restaurantservice.services.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.barani.fds.restaurantservice.model.Restaurant;
import com.barani.fds.restaurantservice.repo.RestaurantRepository;

@RunWith(MockitoJUnitRunner.class)
public class RestaurantServiceImplTest {
	
	@Mock
	RestaurantRepository dataServiceMock;
	
	@InjectMocks
	RestaurantServiceImpl businessImpl;

	@Before
	public void setup(){
	    MockitoAnnotations.initMocks(this); //without this you will get NPE
	}
	
	@Test
	 public void testFindAllRestaurant() {
		when(dataServiceMock.findAll()).thenReturn(getMockRestList());
		assertEquals(1, businessImpl.findAllRestaurant().size());

	 }

	@Test
	public void testFindRestaurantByIdSuccess() {
		when(dataServiceMock.findById(4)).thenReturn(getMockRes());
		assertEquals(true, businessImpl.findRestaurantById(4).isPresent());
    }
	
	@Test
	public void testFindRestaurantByIdFailure() {
		when(dataServiceMock.findById(4)).thenReturn(getMockRes());
		assertEquals(false, businessImpl.findRestaurantById(5).isPresent());
    }

    @Test
    public void testFindAllMenuItems() {
    	assertEquals(null, businessImpl.findAllMenuItems(4));       
    }

   

	private List<Restaurant> getMockRestList() {
		List<Restaurant> list = new ArrayList<Restaurant>();
		Restaurant res = new Restaurant();
		res.setName("Test");
		list.add(res);
		return list;
	}
	
	private Optional<Restaurant> getMockRes() {
		Restaurant res = new Restaurant();
		res.setName("Test");
		return Optional.of(res);
	}

}
