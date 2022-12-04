package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(DepartmentAlreadyExistsException.class)
	public ResponseEntity<String> employeeAlreadyExistsException() {
		return new ResponseEntity<String>("Department already exists...", HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(DepartmentNotFoundException.class)
	public ResponseEntity<String> employeeNotFoundException(){
		return new ResponseEntity<String>("Department Not found...", HttpStatus.CONFLICT);
	}
}
