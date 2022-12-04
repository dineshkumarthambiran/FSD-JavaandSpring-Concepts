package org.NWSpringdemo.SpringJDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeCrud {
	
	JdbcTemplate jdbctemplate;

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	public EmployeeCrud(JdbcTemplate jdbctemplate) {
		super();
		this.jdbctemplate = jdbctemplate;
	}

	public EmployeeCrud() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void insertARecord(Employee employee) {
		
		Object[] params = {
				employee.getEid(),
				employee.getEname(),
				employee.getLocation(),
				employee.getSalary()
				
		};
		
		int updaterecs = jdbctemplate.update("Insert into employee2 values(?,?,?,?)", params);
		
		System.out.println(updaterecs+"record has been inserted");
		
		
		}
	
 public void updateARecord(Employee employee) {
		
		Object[] params = {
				
				employee.getEname(),
				employee.getLocation(),
				employee.getSalary(),
				employee.getEid()
				
		};
		
		int updaterecs = jdbctemplate.update("update employee2 set ename=?,location=?,salary=? where eid=?", params);
		
		System.out.println(updaterecs+"record has been updated");
		
		
		}
 
 public void deleteARecord(Employee employee) {
		
		Object[] params = {
				
				employee.getEid()
				
		};
		
		int deleterecs = jdbctemplate.update("delete from employee2 where eid=?", params);
		
		System.out.println(deleterecs+"record has been deleted");
		
		
		}
 
  public List<Employee> getAllrecords(){
	 List<Map<String, Object>> queryForList = jdbctemplate.queryForList("select * from employee2");
	 
	 List<Employee> emplist=new LinkedList<>();
	 
	 for(Map<String, Object> map:queryForList)
	 {
		 Employee employee = new Employee();
			employee.setEid((Integer)map.get("eid"));
			employee.setEname((String)map.get("ename"));
			employee.setLocation((String)map.get("location"));
			employee.setSalary((Integer)map.get("salary"));
			
			emplist.add(employee);
		}
		
		return emplist;

		 
	 }
  
	  public List<Employee> getAllrecordsUsingRowMap()
	  {
		  List<Employee> emplist = jdbctemplate.query("select * from employee2",new RowMapper<Employee>() {
	
			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee emp = new Employee();
				emp.setEid(rs.getInt(1));
				emp.setEname(rs.getString(2));
				emp.setLocation(rs.getString(3));
				emp.setSalary(rs.getInt(4));
				return emp;
				}
			 
		  });
		  return emplist;
	  } 
 }
 
 
 


