package org.NWSpringdemo.BeanLifecycle;

public class Mentor {
	
	String mid;
	String mname;
	int salary;
	public Mentor(String mid, String mname, int salary) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.salary = salary;
	}
	public Mentor() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Mentor [mid=" + mid + ", mname=" + mname + ", salary=" + salary + "]";
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void init()
	{
		System.out.println("mentor initiated");
	}
	
	public void destroy() {
		System.out.println("mentor destroyed");
	}
	
	
	

}
