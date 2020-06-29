package com.barani.fds.orderservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.barani.fds.orderservice.model.CustomerOrder;
import com.barani.fds.orderservice.services.OrderService;

@RestController
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }


    @RequestMapping(value = "/orders", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<CustomerOrder> getAllCustomerOrder(@RequestParam(value = "customer_id") String customerId) {
        return this.orderService.findAllCustomerOrders(customerId);
    }

    

    @RequestMapping(value = "/order/{orderId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Optional<CustomerOrder> getRestaurantById(@PathVariable("orderId") Integer orderId) {
        return this.orderService.findOrderById(orderId);
    }



    @RequestMapping(value = "/orders", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void createRestaurants(@RequestBody List<CustomerOrder> order) {
        this.orderService.createOrders(order);
    }
    
    @RequestMapping(value = "/order", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void createRestaurants(@RequestBody CustomerOrder order) {
        this.orderService.createOrder(order);
    }
    
    @RequestMapping(value = "/order/{orderId}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void cancelOrder(@PathVariable("orderId") Integer orderId) {
        this.orderService.cancelOrder(orderId);
    }
}
