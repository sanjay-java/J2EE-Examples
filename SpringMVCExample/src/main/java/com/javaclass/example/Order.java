package com.javaclass.example;

import org.springframework.stereotype.Component;


public class Order {

	private String orderId;
	private String orderName;
	private Double price;
	
	public Order(String orderId, String orderName, Double price) {
		this.orderId = orderId;
		this.orderName = orderName;
		this.price = price;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
