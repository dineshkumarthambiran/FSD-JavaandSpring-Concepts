package org.NWSpringdemo.SpringJDBCtask;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class DepartmentCrud {
	
	JdbcTemplate jdbctemplate;

	public DepartmentCrud() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DepartmentCrud(JdbcTemplate jdbctemplate) {
		super();
		this.jdbctemplate = jdbctemplate;
	}

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	
	public void insertARecord(Department department) {
		
		Object[] parameters = {
				
				department.getDeptid(),
				department.getDeptname(),
				department.getLocation()
				
		};
		
		int record = jdbctemplate.update("Insert into Department values (?,?,?)", parameters);
		
		System.out.println(record+"record has been inserted");
			
	}
	
	public void updateARecord(Department department) {
			
			Object[] parameters = {
					
					
					department.getDeptname(),
					department.getLocation(),
					department.getDeptid()
					
			};
			
			int record = jdbctemplate.update("update Department set deptname=?,location=? where deptid = ?", parameters);
			
			System.out.println(record+"record has been has been updated");
				
		}
	
	public void deleteARecord(Department department) {
		
		Object[] parameters = {
				
				department.getDeptid()
				
		};
		
		int record = jdbctemplate.update("delete from Department where deptid = ?", parameters);
		
		System.out.println(record+"record has been has been deleted");
			
	}
	
	 public List<Department> getAllrecords()
	  {
		  List<Department> deptlist = jdbctemplate.query("select * from Department",new RowMapper<Department>() {
	
			@Override
			public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
				Department dept = new Department();
				dept.setDeptid(rs.getInt(1));
				dept.setDeptname(rs.getString(2));
				dept.setLocation(rs.getString(3));
				return dept;
				}
			 
		  });
		  return deptlist;
	  } 
	 
	 public List<Department> findARecord(Department department) {
			
		 List<Department> deptlist = jdbctemplate.query("select * from Department where deptid="+department.deptid+"",new RowMapper<Department>() {
				
				@Override
				public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
					Department dept = new Department();
					dept.setDeptid(rs.getInt(1));
					dept.setDeptname(rs.getString(2));
					dept.setLocation(rs.getString(3));
					return dept;
					}
				 
			  });
			  return deptlist;
				
		}
	 
	
	
	

}
