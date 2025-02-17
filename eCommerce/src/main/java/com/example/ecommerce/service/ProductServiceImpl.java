package com.example.ecommerce.service;

import java.util.List;

import com.example.ecommerce.model.Product;

public interface ProductServiceImpl {

	 Product updateProduct(Product product);
     Product addProduct(Product product);
     
	List<Product> updateProductById(Integer productId);
	List<Product> updateProductName(String productName);
	void deleteProductById(Integer productId);
	List<Product> getAllProduct (Product product);
}