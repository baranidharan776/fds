package com.barani.fds.restaurantservice.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "RESTAURANT")
public class Restaurant {

	 	@Column(name = "restaurant_id")
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer id;

	    @Column(name = "restaurant_name")
	    private String name;
	    
	    @Column(name = "restaurant_address")
	    private String address;
	    
	    @ManyToOne
	    @JoinColumn(name = "restaurant_city")
	    private City city;
	    
	    @Column(name="ratings")
	    private Double ratings;
	    
	    @Column(name="price_level")
	    private Integer priceLevel;
	    
	    @OneToMany(cascade = CascadeType.ALL, targetEntity = MenuItem.class,
	    		mappedBy = "restaurant",  fetch=FetchType.LAZY)
	    private Set<MenuItem> menuItems;

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
		 * @return the address
		 */
		public String getAddress() {
			return address;
		}

		/**
		 * @param address the address to set
		 */
		public void setAddress(String address) {
			this.address = address;
		}

		/**
		 * @return the city
		 */
		public City getCity() {
			return city;
		}

		/**
		 * @param city the city to set
		 */
		public void setCity(City city) {
			this.city = city;
		}

		public Double getRatings() {
			return ratings;
		}

		public void setRatings(Double ratings) {
			this.ratings = ratings;
		}

		public Integer getPriceLevel() {
			return priceLevel;
		}

		public void setPriceLevel(Integer priceLevel) {
			this.priceLevel = priceLevel;
		}

		public Set<MenuItem> getMenuItems() {
			return menuItems;
		}

		public void setMenuItems(Set<MenuItem> menuItems) {
			this.menuItems = menuItems;
		}
		
		
	    
	    
}

