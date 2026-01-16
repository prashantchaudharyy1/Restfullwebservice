package com.example.restful.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restful.model.Admin;

@RestController

public class AdminController {

   
	@GetMapping
	public Admin admin() {
		System.out.println("MyController");
		return new Admin("Prashant","2104");
	}
	
	
}
