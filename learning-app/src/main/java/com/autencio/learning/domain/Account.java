package com.autencio.learning.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Account {

	private String id;
	
	private String username;
	
	public Account() {
		
	}

	public Account(String username) {
		this.username = username;
	}	
}
