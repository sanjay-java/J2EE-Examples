package com.javaclass.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/customer")
public class CustomerResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getCustomer() {
		return "Sanjay";
	}
}

// CRUD as HTTP methods

// CREATE  - POST
// READ    - GET
// UPDATE  - PUT
// DELETE  - DELETE

// customer - data 
// order - data

// get all orders for all customers
// get order data by order number
	// request to service order number
	// response is order data or empty

// get all orders for a customer by customer id


