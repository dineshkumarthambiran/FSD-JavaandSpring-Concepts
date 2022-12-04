package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.exception.DepartmentAlreadyExistsException;
import com.example.demo.exception.DepartmentNotFoundException;


import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	DepartmentRepository deptrepo;

	@Override
	public Department saveDepartment(Department department) throws DepartmentAlreadyExistsException {
		if(deptrepo.existsById(department.getDeptid())) {
			throw new DepartmentAlreadyExistsException("Department already available..");
		}
		return deptrepo.save(department);

	}

	@Override
	public Department findAnDepartment(int id) throws DepartmentNotFoundException {
		if(!deptrepo.existsById(id)) {
			throw new DepartmentNotFoundException("Department Not Found...");
		}
		
		return deptrepo.findById(id).get();

	}

	@Override
	public List<Department> findAllDepartment() {
		return deptrepo.findAll();
	}

}
