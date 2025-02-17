package com.example.ecommerce.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.model.Order;
import com.example.ecommerce.service.OrderService;


@RestController
@RequestMapping(path="/ecommerce")
public class OrderController {
	@Autowired
	@Qualifier("orderService")
			private OrderService orderService;
	@PostMapping(value = "/order/order" ,produces= {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
	public Order saveOrder(@RequestBody Order order) {
		return orderService.saveOrder(order);
	}

	@PutMapping(value="/order/order", produces= {MediaType.APPLICATION_JSON_VALUE})
	public   Order updateOrder(@RequestBody Order order) {
	return orderService.updateOrder(order);
	}
	
	@DeleteMapping(value="/order/order/{orderId}", produces= {MediaType.APPLICATION_JSON_VALUE})
	public void delete(@PathVariable("orderId") Integer orderId) {
		orderService.delete(orderId);
	}
	
	

	@GetMapping(value="/order/order/{orderId}", produces= {MediaType.APPLICATION_JSON_VALUE})
	public Order getOrderByOrderId(@PathVariable("orderId") Integer orderId) {
	return orderService.getOrderByOrderId(orderId);
	
	}

	@GetMapping(value="/order/order", produces= {MediaType.APPLICATION_JSON_VALUE})
	public  List<Order> getAllOrders(@RequestBody Order order) {
	return orderService.getAllOrders();
	
}

	@GetMapping(value="/order/order/{date}", produces= {MediaType.APPLICATION_JSON_VALUE})
	public List<Order> getAllOrdersByDate(@PathVariable("date") LocalDate date) {
	return orderService.getAllOrdersByDate(date);
	
	}

}






