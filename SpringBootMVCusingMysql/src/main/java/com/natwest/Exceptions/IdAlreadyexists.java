package com.natwest.Exceptions;


public class IdAlreadyexists extends Exception {
	
	String message ;

	@Override
	public String toString() {
		return "IdAlreadyexists [message=" + message + "]";
	}

	public IdAlreadyexists() {
		super();

	}
	

	
	

}
