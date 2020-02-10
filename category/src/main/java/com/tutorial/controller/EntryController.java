package com.tutorial.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entry")
public class EntryController {

	@GetMapping("/testGet")
	public Map<String, String> getTest() {
		//list
		List<String> someList = new ArrayList<>();
		someList.add("one");
		someList.add("two");
	
		//map (Key - value)
		Map<String, String> someMap = new HashMap<>();
		someMap.put("1", "Apple");
		someMap.put("2", "Orange");
		someMap.put(null, "Banana");
		
		return someMap;
	}
}
