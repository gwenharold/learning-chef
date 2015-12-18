package com.autencio.learning.domain;

import org.springframework.data.annotation.Id;

public class Account {

	@Id
	private String id;
	
	private String username;
	
	public Account() {
		
	}

	public Account(String username) {
		this.username = username;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}	
}
