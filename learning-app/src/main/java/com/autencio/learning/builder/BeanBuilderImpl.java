package com.autencio.learning.builder;

import com.autencio.learning.bean.AccountBean;
import com.autencio.learning.domain.Account;

public class BeanBuilderImpl implements BeanBuilder {

	@Override
	public AccountBean build(Account account) {
		AccountBean accountBean = new AccountBean(account);
		return accountBean;
	}

}
