package com.autencio.learning.domain;

import lombok.Data;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.util.Assert;

@Data
@Document
public class Customer {

	private String id;
	
	private String firstname;
	
	private String lastname;
	
	private Address address;
	
	public Customer(String firstname, String lastname) {
		
		Assert.hasText(firstname, "Must not be empty or null");
		Assert.hasText(lastname, "Must not be empty or null");
		
		this.firstname = firstname;
		this.lastname = lastname;
	}
}
