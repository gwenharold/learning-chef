package com.autencio.learning.bean;

import com.autencio.learning.domain.Account;

public class AccountBean {

	private String id;

	private String username;

	private String firstname;
	
	private String lastname;
	
	private String email;
	
	public AccountBean() {
		
	}
	
	public AccountBean(String username) {
		this.username = username;
	}
	
	public AccountBean(Account account) {
		this.id = account.getId();
		this.username = account.getUsername();
		this.firstname = account.getFirstname();
		this.lastname = account.getLastname();
		this.email = account.getEmail();
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
	

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
