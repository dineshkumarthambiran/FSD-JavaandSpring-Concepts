package org.NWSpringdemo.SpringJDBCtask;

public class Department {
	
	int deptid;
	String deptname;
	String location;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int deptid, String deptname, String location) {
		super();
		this.deptid = deptid;
		this.deptname = deptname;
		this.location = location;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", deptname=" + deptname + ", location=" + location + "]";
	}
	
	

}
