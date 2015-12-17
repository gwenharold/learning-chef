package com.autencio.learning.service;

import com.autencio.learning.domain.Account;

public interface AccountService {

	Account create(Account account);

	void delete(String id);

	Iterable<Account> findAll();

	Account findById(String id);

	void update(Account account);
}
