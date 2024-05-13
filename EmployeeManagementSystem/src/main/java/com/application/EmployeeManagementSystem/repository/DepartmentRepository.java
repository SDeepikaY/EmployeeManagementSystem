package com.application.EmployeeManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.EmployeeManagementSystem.domain.Department;


@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
