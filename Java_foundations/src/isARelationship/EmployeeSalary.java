package isARelationship;

public class EmployeeSalary {
	
	int salary=10000;
	String dept="Hr";
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void displaysalary() {
		System.out.println("hi Here is Your Salary "+salary);
	}
	public void dislayDept() {
		System.out.println("I working at the "+dept+" department");
		
	}

}
