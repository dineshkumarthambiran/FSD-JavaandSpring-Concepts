package com.natwest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.natwest.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>   {
	
	

}
