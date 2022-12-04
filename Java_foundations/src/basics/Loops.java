package basics;
import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		
		int num[]=new int[5];
		int sum = 0;
		Scanner scan = new Scanner(System.in);	
		System.out.println("enter the array elements");
		
		for(int i=0;i<num.length;i++)
		{
			num[i]= scan.nextInt();
			sum = num[i]+sum;

	    }
		System.out.println(sum);
}
}
