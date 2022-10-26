package com.microservice.services;

import java.util.Optional;

import com.microservice.entities.Department;

public interface DepartmentService {

	public Department saveDepartment(Department department);
	public Optional<Department> findDepartmentById(int id);
}
