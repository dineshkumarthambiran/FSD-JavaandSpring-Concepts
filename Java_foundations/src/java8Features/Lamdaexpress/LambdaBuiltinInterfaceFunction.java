package java8Features.Lamdaexpress;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaBuiltinInterfaceFunction {

	public static void main(String[] args) {
		
//		predicate helps checking a condition whether it is true or not 
		Predicate<String> checkIDisMoreThan5 = name -> name.length()>5;
		
		Predicate<Integer> checkage =  age -> age>18;
		
		System.out.println(checkage.test(36));
		
//function 
		
		Scanner s = new Scanner(System.in);
		
		
		
		Function<String, String> ConvertUppertoLower = name -> name.toLowerCase();
		System.out.println("Enter the Name");
		String name = s.nextLine();
		System.out.println("Converted String is "+ConvertUppertoLower.apply(name));
		
		

	}


}
