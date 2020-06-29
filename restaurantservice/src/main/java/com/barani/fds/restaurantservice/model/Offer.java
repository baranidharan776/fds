package com.barani.fds.restaurantservice.model;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "OFFER")
public class Offer {
	
	@Column(name = "offer_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "offer_name")
    private String name;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "date_from")
    private Date dateFrom;
    
    @Column(name = "date_to")
    private Date dateTo;
    
    @Column(name = "time_from")
    private Time timeFrom;
    
    @Column(name = "time_to")
    private Time timeTo;
    
    @Column(name = "offer_price_value")
    private Double offerPriceValue;
    
    @Column(name = "offer_price_type")
    private String offerPriceType;
    
    @ManyToOne
 	@JoinColumn(name = "menu_item_id")
 	private MenuItem menuItem;

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
	 * @return the dateFrom
	 */
	public Date getDateFrom() {
		return dateFrom;
	}

	/**
	 * @param dateFrom the dateFrom to set
	 */
	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	/**
	 * @return the dateTo
	 */
	public Date getDateTo() {
		return dateTo;
	}

	/**
	 * @param dateTo the dateTo to set
	 */
	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

	/**
	 * @return the timeFrom
	 */
	public Time getTimeFrom() {
		return timeFrom;
	}

	/**
	 * @param timeFrom the timeFrom to set
	 */
	public void setTimeFrom(Time timeFrom) {
		this.timeFrom = timeFrom;
	}

	/**
	 * @return the timeTo
	 */
	public Time getTimeTo() {
		return timeTo;
	}

	/**
	 * @param timeTo the timeTo to set
	 */
	public void setTimeTo(Time timeTo) {
		this.timeTo = timeTo;
	}

	/**
	 * @return the offerPriceValue
	 */
	public Double getOfferPriceValue() {
		return offerPriceValue;
	}

	/**
	 * @param offerPriceValue the offerPriceValue to set
	 */
	public void setOfferPriceValue(Double offerPriceValue) {
		this.offerPriceValue = offerPriceValue;
	}

	/**
	 * @return the offerPriceType
	 */
	public String getOfferPriceType() {
		return offerPriceType;
	}

	/**
	 * @param offerPriceType the offerPriceType to set
	 */
	public void setOfferPriceType(String offerPriceType) {
		this.offerPriceType = offerPriceType;
	}

	public MenuItem getMenuItem() {
		return menuItem;
	}

	public void setMenuItem(MenuItem menuItem) {
		this.menuItem = menuItem;
	}
    
    

}
