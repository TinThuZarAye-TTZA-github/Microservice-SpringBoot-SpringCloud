package com.microservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
	
	@GetMapping("/userServiceFallback")
	public String userServiceFallBack() {
		return "User Service is taking too long";
	}
	
	@GetMapping("/departmentServiceFallback")
	public String departmentServiceFallBack() {
		return "Department Service is taking too long";
	}
}
