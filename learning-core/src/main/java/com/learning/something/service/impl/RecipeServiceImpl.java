package com.learning.something.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.learning.something.domain.Recipe;
import com.learning.something.repositories.RecipeRepository;
import com.learning.something.service.RecipeService;

public class RecipeServiceImpl implements RecipeService {

	@Autowired
	private RecipeRepository recipeRepository;
	
	@Override
	public void save(Recipe recipe) {
		recipeRepository.save(recipe);
	}

	@Override
	public Recipe findByName(String name) {
		return recipeRepository.findByName(name);
	}

}
