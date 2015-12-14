package com.learning.something.service;

import com.learning.something.domain.Account;

public interface AccountService {

	void save(Account account);
	
	Account findByUsername(String username);
}
