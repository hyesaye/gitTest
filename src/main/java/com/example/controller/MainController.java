package com.example.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
	
	@PostMapping(value = "/write")
	public Map<String, Object> write(){
		return null;
	}

}
