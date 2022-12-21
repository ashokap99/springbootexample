package com.jpa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.demo.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

}
