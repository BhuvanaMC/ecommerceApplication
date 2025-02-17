package com.example.ecommerce.repo;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ecommerce.model.Customer;

@Repository("customerRepo")
@Scope("singleton")
public interface customerRepo extends JpaRepository<Customer, Integer>{

	List<Customer> findByCustomerId(Integer customerId);
	
}
