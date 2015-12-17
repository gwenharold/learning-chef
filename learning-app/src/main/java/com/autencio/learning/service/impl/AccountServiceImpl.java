package com.autencio.learning.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.autencio.learning.domain.Account;
import com.autencio.learning.repository.AccountRepository;
import com.autencio.learning.service.AccountService;

public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;
	
	@Override
	public Account create(Account account) {
		return accountRepository.save(account);
	}

	@Override
	public void delete(String id) {
		Account account = findById(id);
		accountRepository.delete(account);	
	}

	@Override
	public Iterable<Account> findAll() {
		return accountRepository.findAll();
	}

	@Override
	public Account findById(String id) {
		return accountRepository.findOne(id);
	}

	@Override
	public void update(Account account) {
		accountRepository.save(account);
	}

}
