package hasARelationship;

public class Employee {
	
	int empId;
	String empName;
	String dept;
	int Salary;
	
	Employee(int empId,String empName,String dept){
		this.empId=empId;
		this.empName=empName;
		this.dept=dept;
		this.Salary();
		
	}
		
	public void displayDetails() {
		System.out.println("Hi "+empName+"! Welcome your Employee id is "+empId);
		System.out.println(" you are working at "+dept);
	
	}
	
	public void Salary() {
		System.out.println("I work in the Indian Shift");
	}

}
