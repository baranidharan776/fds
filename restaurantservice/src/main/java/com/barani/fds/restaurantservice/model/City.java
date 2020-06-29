package com.barani.fds.restaurantservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	    
	    
}
