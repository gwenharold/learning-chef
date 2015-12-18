package com.autencio.learning.builder;

import org.springframework.stereotype.Service;

import com.autencio.learning.bean.AccountBean;
import com.autencio.learning.domain.Account;

@Service
public class BeanBuilderImpl implements BeanBuilder {

	@Override
	public AccountBean build(Account account) {
		AccountBean accountBean = new AccountBean(account);
		return accountBean;
	}

	@Override
	public Account convert(AccountBean accountBean) {
		
		Account account = new Account();
		if(accountBean.getId() != null) {
			account.setId(accountBean.getId());
		}
		account.setUsername(accountBean.getUsername());
		return account;
		
	}
}
