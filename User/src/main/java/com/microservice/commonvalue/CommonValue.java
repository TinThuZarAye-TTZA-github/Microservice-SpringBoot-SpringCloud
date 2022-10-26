package com.microservice.commonvalue;

import com.microservice.entities.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonValue {
	User user;
	Department department;
}
