package com.learning.something.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "application", type = "ingredient")
public class Ingredient {

	@Id
	private Long id;

	private String name;

	public Ingredient() {
		
	}

	public Ingredient(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
