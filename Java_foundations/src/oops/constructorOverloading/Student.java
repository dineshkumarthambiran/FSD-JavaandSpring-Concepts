package oops.constructorOverloading;

public class Student {
	
	int sid;
	String Sname;
	String Sdept;
	
	Student(){
		sid = 123;
		Sname = "Dinesh";
		Sdept = "Science";
		
	}

	public Student(int sid, String Sname) {
		
		this.sid = sid;
		this.Sname = Sname;
		Sdept = "Science";
	}
//public Student(int sid, String Sname,String Sdept) {
//		
//		 this.sid = sid;
//		this.Sname = Sname;
//		Sdept = "Science";
//	}
	
	public void displayDet() {
		System.out.println("Sname "+Sname);
		System.out.println("Sid "+sid);
		System.out.println("Sdept "+Sdept);
		
	}
public static void main(String[] args) {
	Student user1 = new Student(1234,"dina");
//	user1.displayDet();
	user1.displayDet();
}
}
