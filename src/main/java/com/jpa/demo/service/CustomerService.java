package com.jpa.demo.service;

import java.util.List;

import com.jpa.demo.model.Customer;

public interface CustomerService {
	Customer saveCustomer(Customer customer);
	List<Customer> getAllCustomers();
	public void getDeleteCustById(Integer custId);
	//Customer pickedProducts(Integer custId,Integer proId);
	 
}
