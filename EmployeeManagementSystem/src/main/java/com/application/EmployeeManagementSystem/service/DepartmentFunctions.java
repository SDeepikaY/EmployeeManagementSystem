package com.application.EmployeeManagementSystem.service;

import com.application.EmployeeManagementSystem.domain.Department;

public interface DepartmentFunctions {

	void createDepartment(Department department);

	void deleteDepartmentById(Integer departmentId);

	Department getDepartmentById(Integer departmentId);

	void updateDepartment(Department department);

	

}
