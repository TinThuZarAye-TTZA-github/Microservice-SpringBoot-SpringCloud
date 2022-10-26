package com.microservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.entities.Department;
import com.microservice.services.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepatementController {

	@Autowired
	DepartmentService service;
	
	@PostMapping("/add")
	@ResponseBody
	public Department saveDepartment(@RequestBody Department department) {
		Department newDepartment = service.saveDepartment(department);
		String newString = newDepartment.getDepartmentCode();
		System.out.println("NEWSTRING " + newString);
		return newDepartment;
	}
	
	@GetMapping("/{id}")
	public Optional<Department> findById(@PathVariable("id") int id) {
		return service.findDepartmentById(id);
	}
	
}
