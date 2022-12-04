package oops.dynamicpolymorphism;

public class Manager {
	
	int manId;
	String manName;
	
	Manager(){
		manId=124;
		manName="Dinesh";
		
	}
		
	public Manager(int manId, String manName) {
		this.manId = manId;
		this.manName = manName;
	}
	
	public void displayName() {
		System.out.println(manId);
		System.out.println(manName);
	}
	
	public void work() {
		System.out.println("manager is working");}
	public void cal() {
		System.out.println("manager is Attending the cal");
	}
	}


