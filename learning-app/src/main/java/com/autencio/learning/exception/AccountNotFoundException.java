package com.autencio.learning.exception;

public class AccountNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AccountNotFoundException(String username) {
		super(String.format("Account with  username: %s", username));
	}
}
