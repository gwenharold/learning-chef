package com.autencio.learning.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.autencio.learning.bean.AccountBean;
import com.autencio.learning.service.AccountService;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	AccountBean create(@RequestBody AccountBean accountBean) {
		AccountBean accountCreated = accountService.create(accountBean);
		return accountCreated;
	}

	@RequestMapping(value = "{username}", method = RequestMethod.DELETE)
	AccountBean delete(@PathVariable("username") String username) {
		return accountService.delete(username);
	}
	
	@RequestMapping(value = "{username}", method = RequestMethod.GET)
	AccountBean findByUsername(@PathVariable("username") String username) {
		return accountService.findByUsername(username);
	}

	@RequestMapping(method = RequestMethod.GET)
	List<AccountBean> findAll() {
		return accountService.findAll();
	}
	
}
