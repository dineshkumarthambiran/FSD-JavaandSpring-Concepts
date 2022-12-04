package com.natwest.Exception;

public class IdAlreadyExists extends Exception {
	
	String message;

	public IdAlreadyExists() {
		super();
		
	}

	@Override
	public String toString() {
		return "IdAlreadyExists [message=" + message + "]";
	}
	
	

}
