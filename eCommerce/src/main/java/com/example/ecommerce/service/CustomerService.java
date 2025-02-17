package com.example.ecommerce.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.ecommerce.model.Customer;
import com.example.ecommerce.repo.customerRepo;


@Service("customerService")
public class CustomerService implements CustomerServiceImpl{
	@Autowired
	@Qualifier("customerRepo")
	private customerRepo customerRepo;

	@Override
	public Customer updateCustomer(Customer customer) {
		return customerRepo.save(customer);
	}

	@Override
	public Customer addCustomer(Customer customer) {
		return customerRepo.save(customer);
	}

	@Override
	public void delete(int customerId) {
		customerRepo.deleteById(customerId);
		
	}

	@Override
	public List<Customer> updateCustomerId(Integer customerId) {
		return customerRepo.findByCustomerId(customerId);
	}

	@Override
	public List<Customer> getCustomerId(Integer customerId) {
		return customerRepo.findByCustomerId(customerId);
	}


}
