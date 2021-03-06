package com.barani.fds.restaurantservice.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CITY")
public class City {
	
	 	@Column(name = "city_id")
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer id;

	    @Column(name = "city_name")
	    private String name;
	    
	    @Column(name = "city_pincode")
	    private Integer pincode;

	    @OneToMany(cascade = CascadeType.ALL, targetEntity = Restaurant.class,
	    		mappedBy = "city",  fetch=FetchType.LAZY)
	    private Set<Restaurant> restaurant;
	    
		/**
		 * @return the id
		 */
		public Integer getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(Integer id) {
			this.id = id;
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the pincode
		 */
		public Integer getPincode() {
			return pincode;
		}

		/**
		 * @param pincode the pincode to set
		 */
		public void setPincode(Integer pincode) {
			this.pincode = pincode;
		}

		public Set<Restaurant> getRestaurant() {
			return restaurant;
		}

		public void setRestaurant(Set<Restaurant> restaurant) {
			this.restaurant = restaurant;
		}
	    
	    
}
