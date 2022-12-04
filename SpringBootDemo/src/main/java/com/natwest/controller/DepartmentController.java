package com.natwest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
	
	@GetMapping("/record")
	public String getRecord()
	{
		return "1 - HR - Chennai";
	}
	
	@PostMapping("/record")
	public String PostRecord()
	{
		return "one record inserted";
	}

}
