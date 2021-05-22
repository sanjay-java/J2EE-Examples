package com.javaclass.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.javaclass.dao.OrderDao;
import com.javaclass.model.Order;

@Path("/order")
public class OrderResouce {
	
	@GET
	@Path("/{orderId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Order getOrder(@PathParam("orderId") Long orderId) {
		OrderDao dao = new OrderDao();
		return dao.getOrder(orderId);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Order createOrder(Order order) {
		OrderDao dao = new OrderDao();
		return dao.createOrder(order);
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Order updateOrder(Order order) {
		// call to DAO
		return order;
	}
	
	@DELETE
	@Path("/{orderId}")
	public void deleteOrder(@PathParam("orderId") Long orderId) {
		// call to DAO
	}
	
	
}
