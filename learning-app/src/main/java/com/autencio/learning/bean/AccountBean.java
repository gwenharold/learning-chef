package com.autencio.learning.bean;

import com.autencio.learning.domain.Account;

public class AccountBean {

	private String id;

	private String username;
	
	public AccountBean() {
		
	}
	
	public AccountBean(String username) {
		this.username = username;
	}
	
	public AccountBean(Account account) {
		this.id = account.getId();
		this.username = account.getUsername();
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
