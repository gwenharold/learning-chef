package com.autencio.learning.service;

import com.autencio.learning.bean.AccountBean;
import com.autencio.learning.domain.Account;

public interface AccountService {

	AccountBean create(AccountBean accountBean);

	void delete(String id);

	Iterable<Account> findAll();

	Account findById(String id);

	void update(Account account);
}
