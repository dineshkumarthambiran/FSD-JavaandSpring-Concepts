package com.natwest.service;

import java.util.List;

import com.natwest.model.Employee;

public interface EmployeeService {
	
	public Employee saveRecord(Employee employee);
	public List<Employee> findAll();
	public Employee findArecord(int eid);
	
	
	

}
