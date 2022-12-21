package com.jpa.demo.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Customer_details")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cust_Id")
	private int custId;
	@Column(name = "cust_Name")
	private String  custName;
	@Column (name = "cust_Gender")
	private String custGender;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "fk_pro_Id") 
//	private Product product;
//	
//	public Product getProduct() {
//		return product;
//	}
//	public void setProduct(Product product) {
//		this.product = product;
//	}
		@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_cust_Id",referencedColumnName = "cust_Id")
	private List<Product> product;
	
		public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	@ManyToMany
//	@JoinTable(name = "Customer-Products",
//	 joinColumns = @JoinColumn(name = "customer_id"),
//	 inverseJoinColumns = @JoinColumn(name = "product_id")
//	)
//	private Set<Product> pickedProducts = new HashSet<>();
//	
//	
//		public Set<Product> getPickedProducts() {
//		return pickedProducts;
//	}
//	public void setPickedProducts(Set<Product> pickedProducts) {
//		this.pickedProducts = pickedProducts;
//	}
		public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	} 
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustGender() {
		return custGender;
	}
	public void setCustGender(String custGender) {
		this.custGender = custGender;
	}
	

}


