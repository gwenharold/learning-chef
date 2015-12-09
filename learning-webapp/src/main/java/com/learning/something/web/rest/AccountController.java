package com.learning.something.web.rest;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.learning.something.domain.Account;
import com.learning.something.services.AccountService;

@Controller
@RequestMapping("/rest/account")
public class AccountController {

	@Autowired
	private AccountService accountService;

	/*
	 * initial testing for rest account service methods
	 */
	@RequestMapping(method = GET)
	@ResponseBody
	public Object save() {
		Account account = new Account();
		account.setId(1L);
		account.setUsername("demi");
		accountService.save(account);
		return account;
	}
	
	@RequestMapping(method = GET, value="/{username}")
	@ResponseBody
	public Account show(@PathVariable String username) {
		return accountService.findByUsername(username);
	}
	
}
