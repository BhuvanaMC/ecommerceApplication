package com.example.ecommerce.service;

import java.time.LocalDate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.ecommerce.model.Customer;
import com.example.ecommerce.model.Order;
import com.example.ecommerce.repo.OrderRepo;

@Service("orderService")
public class OrderService implements OrderServiceImpl{

	@Autowired
	@Qualifier("orderRepo")
	private OrderRepo orderRepo;

	@Override
	public Order saveOrder(Order order) {
		return orderRepo.save(order);
	}
	@Override
	public Order updateOrder(Order order) {
		return orderRepo.save(order);
	}

	@Override
	public Order getOrderByOrderId(Integer orderId) {
	return orderRepo.findByOrderId(orderId);
	}

	@Override
	public List<Order> getAllOrders() {
	return orderRepo.findAll();
	}

	@Override
	public void delete(Integer orderId) {
	orderRepo.deleteById(orderId);
		
	}

	@Override
	public List<Order> getAllOrdersByDate(LocalDate date) {
	return orderRepo.findByDate(date);
	}



	
	

}
