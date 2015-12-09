package com.learning.something.repositories;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.learning.something.domain.Recipe;

public interface RecipeRepository extends ElasticsearchRepository<Recipe, Long> {
	
	Recipe findByName(String name);

}