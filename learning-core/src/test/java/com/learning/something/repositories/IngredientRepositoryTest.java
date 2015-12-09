package com.learning.something.repositories;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.learning.something.domain.Ingredient;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/applicationContext-test.xml")
public class IngredientRepositoryTest {
	
	@Resource
	private IngredientRepository ingredientRepository;
	
	@Resource
	private ElasticsearchTemplate template;
	
	private Ingredient ingredient;
	
	@Before
	public void setUp() {
		ingredient = new Ingredient("salt");
	}

	@Test
	public void testCreateRecipe() {

		ingredientRepository.save(ingredient);

		Ingredient result = ingredientRepository.findByName("salt");
		Assert.assertNotNull(result);
	}
}
