package com.autencio.learning.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autencio.learning.bean.AccountBean;
import com.autencio.learning.builder.BeanBuilder;
import com.autencio.learning.domain.Account;
import com.autencio.learning.repository.AccountRepository;
import com.autencio.learning.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private BeanBuilder beanBuilder;
	
	@Override
	public AccountBean create(AccountBean accountBean) {

		Account account = beanBuilder.convert(accountBean);
		account = accountRepository.save(account);
		return beanBuilder.build(account);

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
