package com.tutorial.model;

import java.util.List;

//POJO
public class Category {

	private String id;
	private String name;
	private List<SubCategory> subCategories;

	public Category() {

	}

	// overloaded methond
	public Category(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<SubCategory> getSubCategories() {
		return subCategories;
	}

	public void setSubCategories(List<SubCategory> subCategories) {
		this.subCategories = subCategories;
	}

}
