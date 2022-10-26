package com.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.entities.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {

}
