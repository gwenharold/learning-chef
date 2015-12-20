package com.autencio.learning.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

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
	public AccountBean delete(String username) {
		Account account = accountRepository.findByUsername(username);
		accountRepository.delete(account);
		return beanBuilder.build(account);
	}
	
	@Override
	public AccountBean findByUsername(String username) {
		Account account = accountRepository.findByUsername(username);
		return beanBuilder.build(account);
	}

	@Override
	public List<AccountBean> findAll() {
		Iterable<Account> result = accountRepository.findAll();
		
		List<AccountBean> list = new ArrayList<AccountBean>();
		Consumer<Account> consumer = (Account a) -> list.add(beanBuilder.build(a));
		result.forEach(consumer);

		return list;
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
