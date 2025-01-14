package com.application.EmployeeManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.application.EmployeeManagementSystem.domain.Department;
import com.application.EmployeeManagementSystem.domain.Employee;
import com.application.EmployeeManagementSystem.service.DepartmentFunctions;

@RestController
@RequestMapping("/department/api")
public class DepartmentController {
	@Autowired
	DepartmentFunctions departmentFunctions;
	
	@PostMapping
	public void createDepartment(@RequestBody Department department) {
		departmentFunctions.createDepartment(department);
	}
	
	@DeleteMapping
	public void deleteDepartmentById(@RequestParam Integer departmentId) {
		departmentFunctions.deleteDepartmentById(departmentId);
	}
	
	@GetMapping("/{departmentId}")
	public Department getDepartmentById(@PathVariable("departmentId") Integer departmentId) {
		return departmentFunctions.getDepartmentById(departmentId);
	}
	
	@PutMapping
	public void updateDepartment(@RequestBody Department department) {
		departmentFunctions.updateDepartment(department);
	}

}
