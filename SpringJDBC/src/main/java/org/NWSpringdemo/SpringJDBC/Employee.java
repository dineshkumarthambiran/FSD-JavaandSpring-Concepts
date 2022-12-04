package org.NWSpringdemo.SpringJDBC;

public class Employee {
	
	int eid ;
	String ename;
	String location;
	int salary;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int eid, String ename, String location, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.location = location;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", location=" + location + ", salary=" + salary + "]";
	}
	
	

}
