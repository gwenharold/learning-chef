package com.autencio.learning.service;

import java.util.List;

import com.autencio.learning.bean.AccountBean;
import com.autencio.learning.domain.Account;

public interface AccountService {

	AccountBean create(AccountBean accountBean);
	
	AccountBean delete(String username);
	
	AccountBean find(String username);

	List<AccountBean> findAll();

	Account findById(String id);

	void update(Account account);
}
