package com.application.EmployeeManagementSystem.controller;

import java.util.List;

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

import com.application.EmployeeManagementSystem.domain.Employee;
import com.application.EmployeeManagementSystem.model.request.EmployeeRequest;
import com.application.EmployeeManagementSystem.service.EmployeeService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/employee/api")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@PostMapping
	public void createEmployee(@RequestBody EmployeeRequest employee) {
		employeeService.createEmployee(employee);
	}

	@GetMapping("/{employeeId}")
	public Employee getEmployeeById(@PathVariable("employeeId") Integer id) {
		return employeeService.getEmployeeById(id);

	}

	@DeleteMapping
	public void deleteEmployeeById(@RequestParam Integer id) {
		employeeService.deleteEmployeeById(id);
	}

	@GetMapping
	public List<Employee> findAll() {
		return employeeService.findAll();
	}
	
	@PutMapping
	public void updateEmployee(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
	}
	

}