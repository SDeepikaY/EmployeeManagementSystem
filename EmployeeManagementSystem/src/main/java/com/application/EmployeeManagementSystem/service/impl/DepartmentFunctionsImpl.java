package com.application.EmployeeManagementSystem.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.EmployeeManagementSystem.domain.Department;
import com.application.EmployeeManagementSystem.domain.Employee;
import com.application.EmployeeManagementSystem.exceptions.EmployeeNotFoundException;
import com.application.EmployeeManagementSystem.repository.DepartmentRepository;
import com.application.EmployeeManagementSystem.service.DepartmentFunctions;

@Service
public class DepartmentFunctionsImpl implements DepartmentFunctions {
	@Autowired
	DepartmentRepository departmentRepository;
	@Override
	public void createDepartment(Department department){
		departmentRepository.saveAndFlush(department);
	}
	
	@Override
	public void deleteDepartmentById(Integer departmentId) {
		// TODO Auto-generated method stub
		departmentRepository.deleteById(departmentId);
	}
	
	@Override
	public Department getDepartmentById(Integer departmentId) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(departmentId).get() ;
	}
	
	@Override
	public void updateDepartment(Department department) {
		// TODO Auto-generated method stub
		Optional<Department> optionalDepartment = departmentRepository.findById(department.getDepartmentId());
		Department updatedDepartment = optionalDepartment.get();
		updatedDepartment.setDepartmentName(department.getDepartmentName());
		departmentRepository.saveAndFlush(updatedDepartment);
		}
}
