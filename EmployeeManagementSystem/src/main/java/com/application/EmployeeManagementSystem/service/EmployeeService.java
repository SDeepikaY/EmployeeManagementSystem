package com.application.EmployeeManagementSystem.service;

import java.util.List;

import com.application.EmployeeManagementSystem.domain.Employee;
import com.application.EmployeeManagementSystem.model.request.EmployeeRequest;

public interface EmployeeService {

	void createEmployee(EmployeeRequest employee);

	Employee getEmployeeById(Integer id);

	void deleteEmployeeById(Integer id);

	List<Employee> findAll();

	void updateEmployee(Employee employee);
	
	

}
