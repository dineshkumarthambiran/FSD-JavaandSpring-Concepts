package com.natwest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.natwest.model.JWTResponse;
import com.natwest.model.JwtRequest;
import com.natwest.services.MyUserDetailsService;
import com.natwest.utility.JWTutility;

@RestController
public class EmployeeController {
	
	@Autowired
	JWTutility jwttutility;
	
	@Autowired
	AuthenticationManager manager;
	
	@Autowired
	MyUserDetailsService userdetails;
	
	@GetMapping("/emp")
	public String GetAnEmployee() {
		return "Id:1,name:Dinesh";
	}
	
	@PostMapping("/login")
	public JWTResponse login(@RequestBody JwtRequest request) throws Exception {
		
		try {
			UsernamePasswordAuthenticationToken uptoken = 
					new UsernamePasswordAuthenticationToken(request.getUsername(),request.getPassword());
			manager.authenticate(uptoken);
			
					
		}
		catch (BadCredentialsException e) {
			throw new Exception ("Wrong user name and password");
		}
		
		UserDetails loadUserByUsername = userdetails.loadUserByUsername(request.getUsername());
		
		String token = jwttutility.generateToken(loadUserByUsername);
		
		return new JWTResponse(token);
		

	}

}
