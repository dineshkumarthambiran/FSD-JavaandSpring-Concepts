package com.natwest.Exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	String idexists = "Id already exists";
	
	@ExceptionHandler(IdAlreadyexists.class)
	public String IdAlreadyexists() {
		return idexists;
	}
	
	
	
	

}
