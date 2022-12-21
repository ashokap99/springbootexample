package com.jpa.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "product_details")
public class Product {
	@Id
	@Column(name = "pro_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int proId;
	@Column(name = "pro_Name")
	private String proName;
	@Column(name = "pro_Price")
	private int proPrice;
	@Column(name = "pro_Quantity")
	private String proQuantity;
	
//	@OneToOne(cascade = CascadeType.ALL,mappedBy = "product")
//
//	private Customer customer;
//	
//	public Customer getCustomer() {
//		return customer;
//	}
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}
//	@JsonIgnore
//	@ManyToMany(mappedBy = "pickedProducts")
//	private Set<Customer> customer = new HashSet<>();
//	
//	public Set<Customer> getCustomer() {
//		return customer;
//	}
//	public void setCustomer(Set<Customer> customer) {
//		this.customer = customer;
//	}
	public String getProQuantity() {
		return proQuantity;
	}
	public void setProQuantity(String proQuantity) {
		this.proQuantity = proQuantity;
	}
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public int getProPrice() {
		return proPrice;
	}
	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}
	
}
