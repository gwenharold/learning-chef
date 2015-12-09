package com.learning.something.services;

import com.learning.something.domain.Account;

public interface AccountService {

	Account save(Account account);
	
	void delete(Account account);
	
	Account update(Account account);
	
	Account findById(Long id);
	
	Account findByUsername(String username);
}
