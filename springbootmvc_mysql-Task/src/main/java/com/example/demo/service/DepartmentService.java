package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.exception.DepartmentAlreadyExistsException;
import com.example.demo.exception.DepartmentNotFoundException;
import com.example.demo.exception.EmployeeAlreadyExistsException;
import com.example.demo.exception.EmployeeNotFoundException;
import com.example.demo.model.Department;
import com.example.demo.model.Employee;

public interface DepartmentService {
	public Department saveDepartment(Department employee) throws DepartmentAlreadyExistsException;
	public Department findAnDepartment(int id) throws DepartmentNotFoundException;
	public List<Department> findAllDepartment();
}
