package com.autencio.learning.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.autencio.learning.bean.AccountBean;
import com.autencio.learning.service.AccountService;

@RestController
@RequestMapping("/api/account")
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	AccountBean create(@RequestBody AccountBean accountBean) {

		AccountBean accountCreated = accountService.create(accountBean);
		return accountCreated;

	}
	
	@RequestMapping(method = RequestMethod.GET)
	List<AccountBean> findAll() {
		
		return accountService.findAll();
	}
}
