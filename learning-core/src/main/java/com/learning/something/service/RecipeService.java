package com.learning.something.service;

import com.learning.something.domain.Recipe;

public interface RecipeService {

	void save(Recipe recipe);
	
	Recipe findByName(String name);
}
