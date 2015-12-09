package com.learning.something.repositories;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.learning.something.domain.Account;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/applicationContext-test.xml")
public class AccountRepositoryTest {

	@Resource
	private AccountRepository accountRepository;

	@Resource
	private ElasticsearchTemplate template;

	@Test
	public void testCreate() {

		Account account = new Account();
		account.setId(1L);
		account.setUsername("demi");

		accountRepository.save(account);
		Account result = accountRepository.findOne(1L);
		assertThat(result, is(notNullValue()));
		assertThat(result.getId(), is(account.getId()));
	}
	
	@Test
	public void testByUsername() {

		String username = "demi";
		Account account = new Account();
		account.setId(1L);
		account.setUsername(username);

		accountRepository.save(account);
		Account result = accountRepository.findByUsername(username);
		assertThat(result, is(notNullValue()));
		assertThat(result.getUsername(), is(username));
	}
}
