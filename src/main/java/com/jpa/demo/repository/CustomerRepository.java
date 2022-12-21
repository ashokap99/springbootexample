package com.jpa.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.demo.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Serializable>{

}
