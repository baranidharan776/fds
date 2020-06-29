CREATE TABLE CITY (  
city_id INT  PRIMARY KEY,  
city_name VARCHAR(50) NOT NULL,
city_pincode INT(8) NOT NULL
);

CREATE TABLE RESTAURANT (  
restaurant_id INT  PRIMARY KEY,  
restaurant_name VARCHAR(50) NOT NULL,
restaurant_address VARCHAR(100),
restaurant_city INT(8) NOT NULL,
ratings INT(2),
price_level INT(1)
); 

ALTER TABLE RESTAURANT ADD CONSTRAINT FK_RESTAURANT_CITY FOREIGN KEY (restaurant_city) REFERENCES CITY(city_id)  ON DELETE CASCADE;


CREATE TABLE CATEGORY (
category_id int PRIMARY KEY,
category_name VARCHAR(100) NOT NULL
);

CREATE TABLE MENU_ITEM (
menu_item_id int PRIMARY KEY,
menu_name VARCHAR(100) NOT NULL,
category_id int,
restaurant_id int,
description VARCHAR(200),
price DOUBLE NOT NULL,
discount_price DOUBLE,
active BOOLEAN NOT NULL,
food_type varchar(20)
);

ALTER TABLE MENU_ITEM ADD CONSTRAINT FK_MENU_ITEM_CATEGORY FOREIGN KEY (category_id) REFERENCES CATEGORY(category_id);
ALTER TABLE MENU_ITEM ADD CONSTRAINT FK_MENU_ITEM_RES FOREIGN KEY (restaurant_id) REFERENCES RESTAURANT (restaurant_id);

CREATE TABLE OFFER (
offer_id int PRIMARY KEY,
offer_name VARCHAR(100) NOT NULL,
description VARCHAR(200),
date_from DATE,
date_to DATE,
time_from TIME,
menu_item_id int,
time_to TIME,
offer_price_value DOUBLE NOT NULL,
offer_price_type VARCHAR(50) NOT NULL
);



ALTER TABLE OFFER ADD CONSTRAINT FK_MIO_MI FOREIGN KEY (menu_item_id) REFERENCES MENU_ITEM(menu_item_id);

