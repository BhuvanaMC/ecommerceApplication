package com.example.ecommerce.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ecommerce.model.Customer;
import com.example.ecommerce.model.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {
	public List<Order> findByDate(LocalDate date);
	public Order findByOrderId(Integer orderId);
	
}
