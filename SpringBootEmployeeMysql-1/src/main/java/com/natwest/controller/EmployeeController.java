package com.natwest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.natwest.model.Employee;
import com.natwest.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService empserv;
	
	@PostMapping("/employee")
	public ResponseEntity<Employee> saveRecord(@RequestBody Employee employee)
	
	{
		return new ResponseEntity<Employee>(empserv.saveRecord(employee),HttpStatus.OK);
	}

	@GetMapping("/employee")
		public ResponseEntity<List<Employee>> findAll()
	{
		return new ResponseEntity<List<Employee>>(empserv.findAll(),HttpStatus.OK);
	}
}
