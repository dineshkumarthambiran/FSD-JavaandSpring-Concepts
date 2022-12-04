package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.DepartmentAlreadyExistsException;
import com.example.demo.exception.DepartmentNotFoundException;
import com.example.demo.exception.EmployeeAlreadyExistsException;
import com.example.demo.exception.EmployeeNotFoundException;
import com.example.demo.model.Department;
import com.example.demo.model.Employee;
import com.example.demo.service.DepartmentService;
import com.example.demo.service.EmployeeService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class DepartmentController {
	@Autowired
	DepartmentService deptServ;
	
	
	@PostMapping("/department")
	public ResponseEntity<Department> saveEmployee(@RequestBody Department department) throws DepartmentAlreadyExistsException{
		Department savedEmployee = deptServ.saveDepartment(department);
		return new ResponseEntity<Department>(savedEmployee, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/department/{deptid}")
	public ResponseEntity<Department> findAnEmployee(@PathVariable int deptid) throws DepartmentNotFoundException{
		Department department = deptServ.findAnDepartment(deptid);
		return new ResponseEntity<Department>(department, HttpStatus.OK);
	}
	
	
	@GetMapping("/department")
	public ResponseEntity<List<Department>> findAllEmployees(){
		List<Department> department = deptServ.findAllDepartment();
		return new ResponseEntity<List<Department>>(department, HttpStatus.OK);
	}
}
