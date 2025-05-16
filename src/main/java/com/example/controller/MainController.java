package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;

public class MainController {
	
	Logger log = LoggerFactory.getLogger(getClass());
	
	@GetMapping(value = "/")
	public String main() {
	return "\"msg\":\"OK\"}";
	}
	
	@GetMapping(value = "/list")
	public String list() {
	return  "";
	}

}
