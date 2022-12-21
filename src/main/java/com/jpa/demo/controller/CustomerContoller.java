package com.jpa.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.demo.model.Customer;
import com.jpa.demo.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerContoller {
	@Autowired
	private CustomerService customerService;
	
	@PostMapping(value= "/save")
	public ResponseEntity saveCustomer(@RequestBody Customer customer){
		return new ResponseEntity (customerService.saveCustomer(customer),HttpStatus.CREATED);
	}
	
	
	@GetMapping(value = "/getAll")
	public ResponseEntity getAllCustomers(){
		return new ResponseEntity (customerService.getAllCustomers() , HttpStatus.OK);
	}
	@DeleteMapping(value = "/delete/{custId}")
	public ResponseEntity getDeleteCustById(@PathVariable Integer custId){
		customerService.getDeleteCustById(custId);
		return new ResponseEntity(HttpStatus.OK);
	
	}
//	@PutMapping(value = "/{custId}/product/{proId}")
//	public ResponseEntity pickedProducts(@PathVariable Integer custId, @PathVariable Integer proId) {
//		return new ResponseEntity (customerService.pickedProducts(custId, proId), HttpStatus.ACCEPTED);
//		
//	}


}
