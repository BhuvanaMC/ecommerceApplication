package com.example.ecommerce.controller;

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

import com.example.ecommerce.model.Product;
import com.example.ecommerce.service.ProductService;

@RestController
@RequestMapping(path="/ecommerce")
public class ProductController {
	@Autowired
	@Qualifier("productService")
			private ProductService productService;
	
	@PostMapping(value = "/product/product" ,produces= {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}

	@PutMapping(value="/product/product", produces= {MediaType.APPLICATION_JSON_VALUE})
	public Product updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
	}
	
	@DeleteMapping(value="/product/product/{productId}", produces= {MediaType.APPLICATION_JSON_VALUE})
	public void delete(@PathVariable("productId") Integer productId) {
	   productService.deleteProductById(productId);
	}
	
	@PutMapping(value="/product/product/{productName}", produces= {MediaType.APPLICATION_JSON_VALUE})
	public List<Product> updateProductName(@PathVariable("productName") String productName) {
	return productService.updateProductName(productName);
	}

	@GetMapping(value="/product/product", produces= {MediaType.APPLICATION_JSON_VALUE})
		public List<Product> getAllProduct (@RequestBody Product product) {
		return productService.getAllProduct(product);
	}

}





