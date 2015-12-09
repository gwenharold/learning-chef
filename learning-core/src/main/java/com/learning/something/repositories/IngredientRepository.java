package com.learning.something.repositories;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.learning.something.domain.Ingredient;

public interface IngredientRepository extends ElasticsearchRepository<Ingredient, Long>{

	Ingredient findByName(String name);
}
