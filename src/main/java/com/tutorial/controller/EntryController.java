package com.tutorial.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.model.Category;
import com.tutorial.model.SubCategory;

@RestController
@RequestMapping("/entry")
public class EntryController {

	@GetMapping("/testGet")
	public List<Category> getTest() {

		Category community = new Category();
		community.setId("1");
		community.setName("commnity");
		SubCategory childCare = new SubCategory();
		SubCategory pets = new SubCategory();
		community.setSubCategories(Arrays.asList(childCare, pets));
		
		Category housing = new Category("2", "housing");
		SubCategory apts = new SubCategory();
		SubCategory office = new SubCategory();
		
		List<SubCategory> someList = new ArrayList<>();
		someList.add(apts);
		someList.add(office);
		housing.setSubCategories(someList);
		
		List<Category> categories = new ArrayList<>();
		categories.add(community);
		categories.add(housing);
		
		return categories;
	}
}
