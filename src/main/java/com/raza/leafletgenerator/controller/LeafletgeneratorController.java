package com.raza.leafletgenerator.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LeafletgeneratorController {

	@RequestMapping("/about")
	public String index() {
		return "Greetings from LeafletgeneratorController!";
	}

}
