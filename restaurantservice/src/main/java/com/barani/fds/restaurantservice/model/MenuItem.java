package com.barani.fds.restaurantservice.model;

import java.util.List;

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
@Table(name = "MENU_ITEM")
public class MenuItem {
	
	 	@Column(name = "menu_item_id")
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer id;
	 	
	 	@Column(name = "menu_name")
	 	private String name;
	 	
	 	@ManyToOne
	 	@JoinColumn(name = "category_id")
	 	private Category category;
	 	
	 	@ManyToOne
	 	@JoinColumn(name = "restaurant_id")
	 	private Restaurant restaurant;
	 	
	 	@Column(name = "description")
	 	private String description;
	 	
	 	@Column(name = "price")
	 	private Double price;
	 	
	 	@Column(name = "discount_price")
	 	private Double discountPrice;
	 	
	 	@Column(name = "active")
	 	private Boolean active;
	 	
	 	@Column(name = "food_type")
	 	private String foodType;
	 	
	 	@OneToMany(cascade = CascadeType.ALL,targetEntity = Offer.class,
	    	    fetch=FetchType.LAZY, mappedBy = "menuItem")
	    private List<Offer> offers;

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
		 * @return the category
		 */
		public Category getCategory() {
			return category;
		}

		/**
		 * @param category the category to set
		 */
		public void setCategory(Category category) {
			this.category = category;
		}

		/**
		 * @return the description
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * @param description the description to set
		 */
		public void setDescription(String description) {
			this.description = description;
		}

		/**
		 * @return the price
		 */
		public Double getPrice() {
			return price;
		}

		/**
		 * @param price the price to set
		 */
		public void setPrice(Double price) {
			this.price = price;
		}

		/**
		 * @return the active
		 */
		public Boolean getActive() {
			return active;
		}

		/**
		 * @param active the active to set
		 */
		public void setActive(Boolean active) {
			this.active = active;
		}

		/**
		 * @return the foodType
		 */
		public String getFoodType() {
			return foodType;
		}

		/**
		 * @param foodType the foodType to set
		 */
		public void setFoodType(String foodType) {
			this.foodType = foodType;
		}

		/**
		 * @return the discountPrice
		 */
		public Double getDiscountPrice() {
			return discountPrice;
		}

		/**
		 * @param discountPrice the discountPrice to set
		 */
		public void setDiscountPrice(Double discountPrice) {
			this.discountPrice = discountPrice;
		}

		public Restaurant getRestaurant() {
			return restaurant;
		}

		public void setRestaurant(Restaurant restaurant) {
			this.restaurant = restaurant;
		}

		public List<Offer> getOffers() {
			return offers;
		}

		public void setOffers(List<Offer> offers) {
			this.offers = offers;
		}
		
		
	 	 
	 	
}
