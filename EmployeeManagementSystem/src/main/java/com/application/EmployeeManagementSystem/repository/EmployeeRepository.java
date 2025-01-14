package com.application.EmployeeManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.EmployeeManagementSystem.domain.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
}
