package com.natwest.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.natwest.Exceptions.IdAlreadyexists;
import com.natwest.Model.EmployeeModel;
import com.natwest.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
	
	@Autowired
	EmployeeRepository empRepo;

	@Override
	public EmployeeModel insertArecord(EmployeeModel employee) throws IdAlreadyexists {
		
		return empRepo.save(employee);
	}

	@Override
	public List<EmployeeModel> findall() {
		return empRepo.findAll();
		
	}

	@Override
	public EmployeeModel findByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
