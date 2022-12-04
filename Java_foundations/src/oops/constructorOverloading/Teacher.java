package oops.constructorOverloading;

public class Teacher {
	
	int tid;
	String tName;
	String tdept;
	
	Teacher(int tid,String...vals){
		this.tid=tid;
		tName=vals[0];
		tdept=vals[1];
		
		
	}
	
	public void dispDetails() {
		System.out.println(tName);
		System.out.println(tid);
		System.out.println(tdept);
	}
	
	public static void main(String[] args) {
		Teacher user1=new Teacher(1,"rakesh","maths");
		user1.dispDetails();
//		Teacher user2=new Teacher(2,"raj");
//		user2.dispDetails();
		
	}

}
