package com.microservice.service;

import java.util.Optional;

import com.microservice.commonvalue.CommonValue;
import com.microservice.entities.User;

public interface UserService {

	public User saveUser(User newUser);
	public CommonValue userWithDepartmentId(int userId);
}
