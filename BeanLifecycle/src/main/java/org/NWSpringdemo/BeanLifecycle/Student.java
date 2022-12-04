package org.NWSpringdemo.BeanLifecycle;

public class Student {
	
	int sid;
	String sname;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	
	public void init()
	{
		System.out.println("initiated");
	}
	
	public void destroy() {
		System.out.println("destroyed");
	}

}
