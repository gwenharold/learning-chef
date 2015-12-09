package com.learning.something.repositories;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.learning.something.domain.Recipe;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/applicationContext-test.xml")
public class RecipeRepositoryTest {
	
	@Resource
	private RecipeRepository recipeRepository;

	@Resource
	private ElasticsearchTemplate template;
	
	private Recipe recipe;
	
	@Before
	public void setUp() {
		recipe = new Recipe("spaghetti");
	}

	@Test
	public void testCreateRecipe() {

		recipeRepository.save(recipe);

		Recipe result = recipeRepository.findByName("spaghetti");
		Assert.assertNotNull(result);
	}

	@Test
	public void testFindByName() {
		
		Recipe result = recipeRepository.findByName("spaghetti");
		Assert.assertNotNull(result);
	}

	@Test
	public void testFindByName_nonExisting() {
		
		Recipe result = recipeRepository.findByName("gwen");
		Assert.assertNull(result);
	}
}
