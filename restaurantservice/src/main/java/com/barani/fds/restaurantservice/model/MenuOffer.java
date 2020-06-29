package com.barani.fds.restaurantservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MENU_ITEM_OFFER")
public class MenuOffer {

	@Column(name = "menu_offer_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

	@OneToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;
    
    @OneToOne
    @JoinColumn(name = "menu_item_id")
    private MenuItem menuItem;
    
}
