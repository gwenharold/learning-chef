package com.autencio.learning.repository;

import org.springframework.data.repository.CrudRepository;

import com.autencio.learning.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, String> {

	Recipe findByTitle(String title);
}
