package com.natwest.model;

public class JWTResponse {
	
	String jwttoken;

	public JWTResponse(String jwttoken) {
		super();
		this.jwttoken = jwttoken;
	}

	public JWTResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getJwttoken() {
		return jwttoken;
	}

	public void setJwttoken(String jwttoken) {
		this.jwttoken = jwttoken;
	}
	
	

}
