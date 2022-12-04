package oops.dynamicpolymorphism;

public class Employee extends Manager {
	
	Employee(){
		super();
		System.out.println("this has been called");
	}
	
	@Override
	public void work() {
		
		super.work();
		System.out.println("employee is working");}
	@Override
	public void cal() {
		System.out.println("employee is Attending the cal");
	}

}
