package com.spring.CodeBlog.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaMundoController {

	@GetMapping("/ola")
	String olaMundo() {
		
		return"Ola mundo";
		
	}
	
	
}
