package basics;

import java.util.Scanner;

public class Conditions {

	public static void main(String[] args) {
		int mark1,mark2,mark3;
		System.out.println("enter the Mark1,mark2,mark3");
		Scanner s = new Scanner(System.in);
		mark1=s.nextInt();
		mark2=s.nextInt();
		mark3=s.nextInt();
		
		if(mark1>mark2 && mark1>mark3) {
			System.out.println("mark 1 is greatest");
	}
		else if(mark2>mark3)
		{
			System.out.println("mark 2 is greatest");
		}
		else
		{
			System.out.println("mark 3 is greatest");
		}

}
}
