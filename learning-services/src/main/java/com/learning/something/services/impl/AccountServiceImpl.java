package com.learning.something.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.something.domain.Account;
import com.learning.something.repositories.AccountRepository;
import com.learning.something.services.AccountService;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountRepository accountRepository;
	
	public Account save(Account account) {
		return accountRepository.save(account);
	}
	
	public void delete(Account account) {
		accountRepository.delete(account);
	}
	
	public Account update(Account account) {
		return accountRepository.save(account);
	}
	
	public Account findById(Long id) {
		return accountRepository.findOne(id);
	}
	
	public Account findByUsername(String username) {
		return accountRepository.findByUsername(username);
	}
}
