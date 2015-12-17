package com.autencio.learning.repository;

import org.springframework.data.repository.CrudRepository;

import com.autencio.learning.domain.Account;

public interface AccountRepository extends CrudRepository<Account, String>{

}
