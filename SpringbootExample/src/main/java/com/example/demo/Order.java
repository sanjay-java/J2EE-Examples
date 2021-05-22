package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="order")
@Entity
public class Order {

	@Id
	private String id;
	private String customer_id;
	private String item;
	private String toppings;
	private String size;
	private Double price;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getToppings() {
		return toppings;
	}
	public void setToppings(String toppings) {
		this.toppings = toppings;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Order(String id, String customer_id, String item, String toppings, String size, Double price) {
		this.id = id;
		this.customer_id = customer_id;
		this.item = item;
		this.toppings = toppings;
		this.size = size;
		this.price = price;
	}
	
	
}
