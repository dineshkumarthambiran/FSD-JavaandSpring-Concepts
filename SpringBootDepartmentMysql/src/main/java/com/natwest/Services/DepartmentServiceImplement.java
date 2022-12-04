package com.natwest.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.natwest.Model.DepartmentModel;
import com.natwest.Repository.DepartmentRepository;

@Service
public class DepartmentServiceImplement implements DepartmentServices {
	
	@Autowired
	DepartmentRepository deptrepo;

	@Override
	public DepartmentModel saveRecords(DepartmentModel department) {
		
		return deptrepo.save(department);
	}

	@Override
	public List<DepartmentModel> findallRecords() {
	
		return deptrepo.findAll();
	}

	@Override
	public DepartmentModel findARecord(int deptid) {
		
		return deptrepo.findById(deptid).get();
	}

}
