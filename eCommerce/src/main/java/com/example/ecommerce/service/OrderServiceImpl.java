package com.example.ecommerce.service;

import java.time.LocalDate;


import java.util.List;

import com.example.ecommerce.model.Order;

public interface OrderServiceImpl {
	
   Order saveOrder(Order order);
   Order updateOrder(Order order);
	
	 Order getOrderByOrderId(Integer orderId);
	
	 List<Order> getAllOrders();
	void delete(Integer orderId);

	
	 List<Order> getAllOrdersByDate(LocalDate date);

	 
	
}