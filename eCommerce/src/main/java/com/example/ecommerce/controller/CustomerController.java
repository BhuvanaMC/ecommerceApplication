package com.example.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.model.Customer;
import com.example.ecommerce.service.CustomerService;

@RestController
@RequestMapping(path="/ecommerce")
public class CustomerController {

	@Autowired
	@Qualifier("customerService")
			private CustomerService customerService;
	@PostMapping(value = "/customer/customer" ,produces= {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
	public Customer addCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);
	}

	@PutMapping(value="/customer/customer", produces= {MediaType.APPLICATION_JSON_VALUE})
	public Customer updateCustomer(@RequestBody Customer customer) {
	return customerService.updateCustomer(customer);
	}
	@DeleteMapping(value="/customer/customer/{customerId}", produces= {MediaType.APPLICATION_JSON_VALUE})
	public void delete(@PathVariable("customerId") Integer customerId) {
		customerService.delete(customerId);
	}
	
	@PutMapping(value="/customer/customer/{customerId}", produces= {MediaType.APPLICATION_JSON_VALUE})
	public List<Customer>updateCustomerId(@PathVariable("customerId") Integer customerId) {
	return customerService.updateCustomerId(customerId);
	}

	@GetMapping(value="/customer/customer/{customerId}", produces= {MediaType.APPLICATION_JSON_VALUE})
	public List<Customer>getCustomerId(@PathVariable("customerId") Integer customerId) {
	return customerService.getCustomerId(customerId);
	}
	

}



