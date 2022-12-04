package com.natwest.Exception;

public class RecordNotFound extends Exception {
	
	String message;

	@Override
	public String toString() {
		return "RecordNotFound [message=" + message + "]";
	}

	public RecordNotFound() {
		super();

	}
	
	

}
