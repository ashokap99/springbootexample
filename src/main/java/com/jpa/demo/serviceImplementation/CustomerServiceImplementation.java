package com.jpa.demo.serviceImplementation;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.demo.model.Customer;
import com.jpa.demo.model.Product;
import com.jpa.demo.repository.CustomerRepository;
import com.jpa.demo.repository.ProductRepository;
import com.jpa.demo.service.CustomerService;

@Service
public class CustomerServiceImplementation implements CustomerService{
	@Autowired
	private CustomerRepository customRepository;
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generatsaveCustomered method stub
		return customRepository.save(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customRepository.findAll();
	}

	@Override
	public void getDeleteCustById(Integer custId) {
		
			customRepository.deleteById(custId);
		
	}
//	@Override
//	public Customer pickedProducts(Integer custId, Integer proId) {
//		Set<Product> productSet= null;
//		Customer customer = customRepository.findById(custId).get();
//		Product product = productRepository.findById(proId).get();
//		productSet = customer.getPickedProducts();
//		productSet.add(product);
//		customer.setPickedProducts(productSet);
//		return customRepository.save(customer);
//	}

	
}
