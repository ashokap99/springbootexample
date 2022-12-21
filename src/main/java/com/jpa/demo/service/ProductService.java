package com.jpa.demo.service;

import java.util.List;

import com.jpa.demo.model.Product;

public interface ProductService {
	Product saveProduct(Product product);
	List<Product> getAllProducts();

}
