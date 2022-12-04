package com.natwest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.natwest.Model.EmployeeModel;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeModel, Integer>  {
	
	

}
