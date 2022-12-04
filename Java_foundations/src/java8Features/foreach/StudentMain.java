package java8Features.foreach;

import java.util.Arrays;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Student> list = Arrays.asList(
				new Student (1,"dinesh"),
				new Student (2,"vignesh"),
				new Student (3,"Vicky"),
				new Student (4,"Dizy")
				
				
				
				);
		
		list.stream().filter(s->s.getId()<2).forEach(System.out::println);
		

	}

}
