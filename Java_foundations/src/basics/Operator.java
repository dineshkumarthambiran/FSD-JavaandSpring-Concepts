package basics;
import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		int mark1,mark2,mark3;
		System.out.println("enter the Mark1,mark2,mark3");
		Scanner s = new Scanner(System.in);
		mark1=s.nextInt();
		mark2=s.nextInt();
		mark3=s.nextInt();
		
		String result = (mark1>mark2 && mark1>mark3)?"mark1 is greater":(mark2>mark3)?"mark2 is greater":"mark 3 is greater";
		System.out.println(result);
		

		

	}

}
