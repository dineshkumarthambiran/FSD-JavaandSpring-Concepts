package com.natwest.Services;

import com.natwest.Exceptions.IdAlreadyexists;
import com.natwest.Model.EmployeeModel;

public interface EmployeeService {
	
	public EmployeeModel insertArecord(EmployeeModel employee) throws IdAlreadyexists ;
	public void findall();
	public EmployeeModel findByID(int id);
	
	
	

}
