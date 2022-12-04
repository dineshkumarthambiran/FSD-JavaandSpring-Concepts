package Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Customer> list = Arrays.asList(
				new Customer(1,"Dinesh",50000),
				new Customer(2,"Vignesh",3000),
				new Customer(3,"Danish",40000),
				new Customer(4,"Lizy",80000)
				);
		
	
		
//		List<Comparator> sortbyid = (o1,o2)-> o1.id - o2.id ;
		
		
		Collections.sort(list,(o1,o2)-> o1.id - o2.id );
		
		System.out.println();
		System.out.println("sorting by id");
		
		for(Customer c:list)
			
		{
			System.out.println(c);
		}
		
		Collections.sort(list,(o1,o2)-> (o1.name.compareTo(o2.name)));
		
	
		
		
		System.out.println();
		System.out.println("sorting by name");
		
    for(Customer c:list)
			
		{
			System.out.println(c);
		}
		
	}

}
