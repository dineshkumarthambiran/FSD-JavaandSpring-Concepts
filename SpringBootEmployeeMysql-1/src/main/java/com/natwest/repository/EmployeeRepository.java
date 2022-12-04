package com.natwest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natwest.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
