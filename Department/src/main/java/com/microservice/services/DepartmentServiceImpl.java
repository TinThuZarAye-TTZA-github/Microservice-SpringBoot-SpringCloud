package com.microservice.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.entities.Department;
import com.microservice.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	DepartmentRepository repo;

	@Override
	public Department saveDepartment(Department department) {
		Department newDepartment = repo.save(department);
		return newDepartment;
	}

	@Override
	public Optional<Department> findDepartmentById(int id) {
		Optional<Department> dId = repo.findById(id);
		return dId;
	}

	
}
