package com.learning.something.service;

import com.learning.something.domain.Ingredient;

public interface IngredientService {

	void save(Ingredient ingredient);
	
	Ingredient findByName(String name);
}
