package com.learning.something.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.learning.something.domain.Ingredient;
import com.learning.something.repositories.IngredientRepository;
import com.learning.something.service.IngredientService;

public class IngredientServiceImpl implements IngredientService {

	@Autowired
	private IngredientRepository ingredientRepository;
	
	@Override
	public void save(Ingredient ingredient) {
		ingredientRepository.save(ingredient);
	}

	@Override
	public Ingredient findByName(String name) {
		return ingredientRepository.findByName(name);
	}

	
}
