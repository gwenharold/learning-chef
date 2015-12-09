package com.learning.something.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "application", type = "account")
public class Account {

	@Id
	private Long id;

	private String username;
	
	public Account() {
		
	}
	
	public Account(String username) {
		this.username = username;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
