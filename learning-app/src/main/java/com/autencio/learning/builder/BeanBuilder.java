package com.autencio.learning.builder;

import com.autencio.learning.bean.AccountBean;
import com.autencio.learning.domain.Account;

import com.autencio.learning.bean.AccountBean;
import com.autencio.learning.domain.Account;

public interface BeanBuilder {

	AccountBean build(Account account);
}
