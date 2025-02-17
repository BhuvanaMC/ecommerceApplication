package com.example.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.repo.ProductRepo;

@Service("productService")
public class ProductService implements ProductServiceImpl {
	@Autowired
	@Qualifier("productRepo")
	private ProductRepo productRepo;
	
	
	@Override
	public Product updateProduct(Product product) {
		return productRepo.save(product);
	}

	@Override
	public Product addProduct(Product product) {
		return productRepo.save(product);
	}
	@Override
	public void deleteProductById(Integer productId) {
		 productRepo.deleteById(productId);
		
	}

	@Override
	public List<Product> updateProductById(Integer productId) {
		return productRepo.findByProductId(productId);
	}

	@Override
	public List<Product> updateProductName(String productName) {
		return productRepo.findByProductName(productName);
	}



	@Override
	public List<Product> getAllProduct(Product product) {
	return productRepo.findAll();
	}

	

}
