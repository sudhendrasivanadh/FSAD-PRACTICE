package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {
	private int orderid;
	private String customerName;
	private int quantity;
	@Autowired
	private Product product;
	public Order() {
		this.orderid=2004;
		this.customerName="Ravi";
		this.quantity=4;
	}
	public void display() {
		System.out.println("this are the order detiales");
		System.out.println("Order Details:");
        System.out.println("Order ID: " + orderid);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Productid: " + product.getproductid());
        System.out.println("Productname: " + product.getproductname());
        System.out.println("Prize: " + product.getprize());
        System.out.println("Productcatagory: " + product.getcatagory());
		
	}
}
