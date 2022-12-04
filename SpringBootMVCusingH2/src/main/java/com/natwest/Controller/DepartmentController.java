package com.natwest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.natwest.Exception.IdAlreadyExists;
import com.natwest.Exception.RecordNotFound;
import com.natwest.model.Department;
import com.natwest.repository.DepartmentRepository;

@RestController
public class DepartmentController {
	
	@Autowired
	DepartmentRepository deptrepo;
	
	@PostMapping("/dept")
	public ResponseEntity<Department> insertARecord(@RequestBody Department department) throws IdAlreadyExists {
		 
		if(deptrepo.existsById(department.getDeptid()))
		{
			throw new IdAlreadyExists();
			}
		else
		{
		
		Department savedData = deptrepo.save(department);
		
		return new ResponseEntity<Department>(savedData, HttpStatus.CREATED);}
		
	}
	
	@GetMapping("/depts")
	
	public ResponseEntity<List<Department>> findAllDepartment(Department department)
	{
		
		List<Department> findAll = deptrepo.findAll();
		
		return new ResponseEntity<List<Department>>(findAll,HttpStatus.OK);
		
	}
	@GetMapping("/depts/{deptid}")
	public ResponseEntity<Department> findADepartment(@PathVariable int deptid) throws RecordNotFound
	{
		if(!deptrepo.existsById(deptid))
		{
			throw new RecordNotFound();
		}
		
		Department department = deptrepo.findById(deptid).get();
		
		return new ResponseEntity<Department>(department,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/depts/{deptid}")
	
	public void deletebyid(@PathVariable int deptid)
	{
		deptrepo.deleteById(deptid);
	}
	
	

}
