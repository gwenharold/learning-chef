package com.autencio.learning.repositories;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.autencio.learning.configuration.ApplicationConfiguration;
import com.autencio.learning.domain.Customer;
import com.autencio.learning.repository.CustomerRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ApplicationConfiguration.class)
public class CustomerRepositoryIntegrationTest {

	@Autowired CustomerRepository repository;
	
	@Autowired MongoOperations operations;

	Customer demi, karla, gwen;
	
	@Before
	public void setUp() {
		
		repository.deleteAll();
		
		demi = repository.save(new Customer("Demi", "Alexa"));
		karla = repository.save(new Customer("Anna", "Karla"));
		gwen = repository.save(new Customer("Gwen", "Harold"));
	}
	
	/**
	 * Test case to show that automatically generated ids are assigned to the domain objects.
	 */
	@Test
	public void setsIdOnSave() {
		Customer demi = repository.save(new Customer("Demi", "Alexa"));
	}

}
