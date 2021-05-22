package com.javaclass.example;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

	public List<Order> getOrders(){
		
		return Arrays.asList(new Order("12345","Pizza", 15.00),
				new Order("78582","Pizza2", 25.00));
		
	}
		
}
