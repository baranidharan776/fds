CREATE TABLE CITY (  
city_id INT  PRIMARY KEY,  
city_name VARCHAR(50) NOT NULL,
city_pincode INT(8) NOT NULL,
city_distance INT(2) NOT NULL
);

CREATE TABLE CUSTOMER (
customer_id INT(8)  PRIMARY KEY,  
customer_name VARCHAR(50) NOT NULL,
customer_address VARCHAR(100),
customer_city INT(8),
customer_phone VARCHAR(50) NOT NULL,
customer_email VARCHAR(50) NOT NULL,
customer_password VARCHAR(50) NOT NULL,
customer_joined TIMESTAMP NOT NULL,
customer_dob TIMESTAMP
);

ALTER TABLE CUSTOMER ADD CONSTRAINT FK_CUSTOMER_CITY FOREIGN KEY (customer_city) REFERENCES CITY(city_id)  ON DELETE CASCADE;

CREATE TABLE CUSTOMER_ORDER (
order_id int PRIMARY KEY,
restaurant_id int,
eta TIMESTAMP,
delivery_address VARCHAR(100),
customer_id int,
price DOUBLE,
discount DOUBLE,
final_amount DOUBLE,
status varchar(10) NOT NULL
);

ALTER TABLE CUSTOMER_ORDER ADD CONSTRAINT FK_CO_CUS_ID FOREIGN KEY (customer_id) REFERENCES CUSTOMER(customer_id);


CREATE TABLE IN_ORDER (
in_order_id int PRIMARY KEY,
order_id int,
menu_item_id int,
offer_id int,
quantity int NOT NULL,
item_price DOUBLE NOT NULL,
price DOUBLE NOT NULL,
discount_price DOUBLE
);

ALTER TABLE IN_ORDER ADD CONSTRAINT FK_INO_ORDER FOREIGN KEY (order_id) REFERENCES CUSTOMER_ORDER(order_id);
