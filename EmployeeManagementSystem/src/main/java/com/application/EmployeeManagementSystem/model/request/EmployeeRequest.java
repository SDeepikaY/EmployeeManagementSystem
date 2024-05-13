package com.application.EmployeeManagementSystem.model.request;

import java.time.Instant;

import com.application.EmployeeManagementSystem.domain.Department;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeRequest {
	Integer id;
	String firstName;
	String lastName;
	Integer age;
	String email;
	Long salary;
	String designation;
	Instant joiningDate;
	private Integer departmentId;

}
