package com.example.springbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Spring Boot REST Application! This application was created by a student with USN for demonstration purposes.";
	}

}
