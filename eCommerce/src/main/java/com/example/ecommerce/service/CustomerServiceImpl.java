package com.example.ecommerce.service;

import java.util.List;

import com.example.ecommerce.model.Customer;
public interface CustomerServiceImpl {
     Customer updateCustomer(Customer customer);
     Customer addCustomer(Customer customer);
	void delete(int customerId);
	
	
	List<Customer> updateCustomerId(Integer customerId);
	List<Customer> getCustomerId(Integer customerId);
}

