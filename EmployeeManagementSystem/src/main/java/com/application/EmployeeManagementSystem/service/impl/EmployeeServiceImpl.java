package com.application.EmployeeManagementSystem.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.EmployeeManagementSystem.domain.Department;
import com.application.EmployeeManagementSystem.domain.Employee;
import com.application.EmployeeManagementSystem.exceptions.EmployeeNotFoundException;
import com.application.EmployeeManagementSystem.model.request.EmployeeRequest;
import com.application.EmployeeManagementSystem.repository.DepartmentRepository;
import com.application.EmployeeManagementSystem.repository.EmployeeRepository;
import com.application.EmployeeManagementSystem.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	DepartmentRepository departmentRepository;
	@Override
	public void createEmployee(EmployeeRequest employee) {
		// TODO Auto-generated method stub
		Employee employeeObj = new Employee();
		employeeObj.setFirstName(employee.getFirstName());
		employeeObj.setLastName(employee.getLastName());
		employeeObj.setAge(employee.getAge());
		employeeObj.setEmail(employee.getEmail());
		employeeObj.setDesignation(employee.getDesignation());
		employeeObj.setJoiningDate(employee.getJoiningDate());
		employeeObj.setSalary(employee.getSalary());
		Optional<Department> department = departmentRepository.findById(employee.getDepartmentId());
		employeeObj.setDepartment(department.get());
		employeeRepository.saveAndFlush(employeeObj);
	
	}
	
	@Override
	public Employee getEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).get() ;
	}
	@Override
	public void deleteEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
	}
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}
	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Optional<Employee> optionalEmployee = employeeRepository.findById(employee.getId());
		if(!optionalEmployee.isPresent()) {
			throw new EmployeeNotFoundException("Employee with this Id not found");
		}
		else {
			Employee updatedEmployee = optionalEmployee.get();
			updatedEmployee.setAge(employee.getAge());
			updatedEmployee.setFirstName(employee.getFirstName());
			updatedEmployee.setDesignation(employee.getDesignation());
			updatedEmployee.setLastName(employee.getLastName());
			updatedEmployee.setEmail(employee.getEmail());
			updatedEmployee.setSalary(employee.getSalary());
			updatedEmployee.setJoiningDate(employee.getJoiningDate());
			employeeRepository.saveAndFlush(updatedEmployee);
		}
	
		
	}
	
	
}
