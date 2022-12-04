package com.natwest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.natwest.model.Employee;
import com.natwest.repository.EmployeeRepository;

@Service
public class EmployeeServiceImplement implements EmployeeService {

	@Autowired
	EmployeeRepository emprepo;
	
	@Override
	public Employee saveRecord(Employee employee) {
		
		return emprepo.save(employee);
	}

	@Override
	public List<Employee> findAll() {
		
		return emprepo.findAll();
	}

	@Override
	public Employee findArecord(int eid) {
		
		return emprepo.findById(eid).get();	}
	
	
	
	

}
