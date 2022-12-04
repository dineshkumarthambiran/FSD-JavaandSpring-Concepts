package com.natwest.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentModel {
	
	@Id
	int deptid;
	int deptname;
	
	
	

}
