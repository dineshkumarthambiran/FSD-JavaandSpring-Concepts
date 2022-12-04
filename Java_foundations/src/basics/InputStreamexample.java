package basics;
import java.util.Scanner;

public class InputStreamexample {

	public static void main(String[] args) {
		int StudentId;
		String StudentName;
		int age;
		String SchoolName;
		Float CGPA;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your id");
		StudentId = s.nextInt();
		System.out.println("Enter Your Name");
		StudentName =s.next();
		System.out.println("Enter Your Age");
		age = s.nextInt();
		System.out.println("Enter Your School Name");
		SchoolName = s.next();
		System.out.println("Enter Your CGPA");
		CGPA = s.nextFloat();
		System.out.println("Enter Your Grade");
		char Grade = s.next().charAt(0);
		
		System.out.println(" Your id:"+StudentId);
		System.out.println("Your Name:"+StudentName);
		System.out.println("Enter Your Age:"+age);
		System.out.println("Your School Name :"+SchoolName);
		System.out.println(" Your CGPA:"+CGPA);
		System.out.println("Your Grade:"+Grade);
		
		
		
		
		
		
		
		
	}

}
