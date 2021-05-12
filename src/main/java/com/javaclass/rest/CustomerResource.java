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
