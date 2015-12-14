package com.learning.something.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.learning.something.domain.Account;
import com.learning.something.repositories.AccountRepository;
import com.learning.something.service.AccountService;

public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;
	
	public void save(Account account) {
		accountRepository.save(account);
	}

	@Override
	public Account findByUsername(String username) {

		return accountRepository.findByUsername(username);
	}
}
