package com.learning.something.repositories;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.learning.something.domain.Account;

public interface AccountRepository extends ElasticsearchRepository<Account, Long> {

	Account findByUsername(String username);
}
