package com.natwest.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
	
	String message = "record already exist";
	String Record = "Record not found";
	
	@ExceptionHandler(value = IdAlreadyExists.class)
	public ResponseEntity<String> IdAlreadyExists()
	{
		return new ResponseEntity<String>(message,HttpStatus.CONFLICT);
		
	}
	
	@ExceptionHandler(value = RecordNotFound.class )
	public ResponseEntity<String> RecordNotFound(){
		return new ResponseEntity<String>(Record,HttpStatus.NOT_FOUND);
		
		
	}
	

}
