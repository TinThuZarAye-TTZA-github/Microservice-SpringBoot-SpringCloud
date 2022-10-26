package com.microservice.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Department")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int departmentId;
	String departmentName;
	String departmentAddress;
	String departmentCode;
}
