package com.natwest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.natwest.Model.DepartmentModel;
import com.natwest.Services.DepartmentServices;

@RestController
public class Departmentcontroller {
	
	@Autowired
	DepartmentServices deptserv;
	
	@PostMapping("/department")
	public ResponseEntity<DepartmentModel> saveRecords(@RequestBody DepartmentModel department)
	
	{
		return new ResponseEntity<DepartmentModel>(deptserv.saveRecords(department),HttpStatus.OK);
	}
	
	@GetMapping("/department")
	public ResponseEntity <List<DepartmentModel>> findAllRecords()
	{
		return new ResponseEntity <List<DepartmentModel>>(deptserv.findallRecords(),HttpStatus.OK);
	}
	
	

}
