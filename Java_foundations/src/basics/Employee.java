package basics;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your emp id");
		int empId = s.nextInt();
		System.out.println("Enter your name");
		String empName = s.next();
		System.out.println("Enter your Salary per annum");
		int salary = s.nextInt();
		System.out.println("Enter your HRA & Supplementary allowance");
		int hra = s.nextInt();
		System.out.println("Enter your ESI");
		int ESI = s.nextInt();
		System.out.println("Enter your PF per month");
		int pf = s.nextInt();
		
		
		int basicSalary = salary-hra-ESI ;
		
		int payMon = salary/12;
		
		int netpay = payMon - pf;
		
		int netYear = netpay*12;
		
		System.out.println("Welcome "+empName);
		System.out.println("Your Total basicsalary is "+basicSalary);
		System.out.println("Your Grosssalary in month is "+payMon);
		System.out.println("Your net pay per month is "+netpay);
		System.out.println("Your net salary per Year "+netYear);
		
		
		
		
		
		
		
		
		
		
		

	}

}
