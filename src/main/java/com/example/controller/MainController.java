package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MainController {
	
	@GetMapping(value = "/list")
	public String list() {
	return  "";
	}

}
