package com.natwest.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.LinkedList;
import java.util.List;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import com.natwest.model.Employee;
import com.natwest.service.EmployeeService;


@WebMvcTest
class EmployeeControllerTest {
	
	@MockBean
	EmployeeService empserv;
	
	@Autowired
	MockMvc mockmvc;
	


	@Test
	void testSaveRecord() {
		
		Employee emp = new Employee(1,"vignesh","delhi");
		
		when(empserv.saveRecord(emp)).thenReturn(emp);
		
		mockmvc.perform(post("/employee").contentType(MediaType.APPLICATION_JSON))
		.andExpect(jsonPath(("$", null));
		
		
		
		
		
	}

	@Test
	void testFindAll() throws Exception {
		
		List<Employee> emplist = new LinkedList<>();
		
		emplist.add(new Employee(1, "Dina", "Chennai"));
		emplist.add(new Employee(2, "Raja", "Delhi"));
		
		when(empserv.findAll()).thenReturn(emplist);
		
		mockmvc.perform(get("/employee").contentType(MediaType.APPLICATION_JSON))
		.andExpect(status().is(200))
		.andExpect(jsonPath("$", Matchers.hasSize(2)));
		
		
		
	}

}
