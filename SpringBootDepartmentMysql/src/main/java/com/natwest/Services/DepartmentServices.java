package com.natwest.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.natwest.Model.DepartmentModel;
import com.natwest.Repository.DepartmentRepository;

public interface DepartmentServices {

	
	public DepartmentModel saveRecords(DepartmentModel department);
	
	public List<DepartmentModel> findallRecords();
	
	public DepartmentModel findARecord(int deptid);
	
	
	
	

}
