import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ModyingStudentmarksMap {

	public static void main(String[] args) {
		
		
		List <Integer> list =  Arrays.asList(98,95,99,32,25,28,15);
		System.out.println("Old list");
		System.out.println(list);
		
//	modifying marks and making it to 35
		List <Integer> filteredlist=list.stream().map(m->{
			while(m<35)
			{ m++;
			}
			return m;
		}).collect(Collectors.toList());
		System.out.println("New modified list");
		System.out.println(filteredlist);
		
//	maximum marks	
		System.out.println("max marks");
		Integer maxnum = list.stream().max((n1,n2)->n1-n2).get();
		System.out.println(maxnum);
		
//	minimum marks	
		System.out.println("min marks");
		Integer minnum = list.stream().min((n1,n2)->n1-n2).get();
		System.out.println(minnum);
	}
	
	

}
