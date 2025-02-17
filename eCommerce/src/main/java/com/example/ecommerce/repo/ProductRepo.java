package com.example.ecommerce.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ecommerce.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

	List<Product> findByProductId(Integer productId);

	List<Product> findByProductName(String productName);

}
