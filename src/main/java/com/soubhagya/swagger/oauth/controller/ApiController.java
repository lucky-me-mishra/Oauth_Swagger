package com.soubhagya.swagger.oauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	
	public ApiController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping(value="/employee/{id}")
	private String getEmployeeById(@PathVariable String id){
		return id;	
	}

}
