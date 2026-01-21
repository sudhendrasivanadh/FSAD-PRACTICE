package com.klu.model;

import org.springframework.stereotype.Component;

@Component
public class Product {
	private int productId;
	private String productName;
	private double prize;
	private String catagory;
	
	public Product() {
		this.productId=101;
		this.productName="laptop";
		this.prize=55000.00;
		this.catagory="electronices";
	}
	public int getproductid() {
		return productId;
		
	}
	public String getproductname() {
		return productName;
	}
	public double getprize() {
		return prize;
	}
	public String getcatagory() {
		return catagory;
	}
	
	
}
