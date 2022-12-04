import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Integer> list = Arrays.asList(23,25,30,35,45,50);
		
		List <Integer> sorted = list.stream().sorted((m1,m2)->m1-m2).collect(Collectors.toList());
		
		Integer maxmarks =list.stream().sorted((m1,m2)->m2-m1).collect(Collectors.toList()).get(0);
		
		Integer minmarks =list.stream().sorted((m1,m2)->m1-m2).collect(Collectors.toList()).get(0);
		
		System.out.println(sorted);
		System.out.println(maxmarks);
		System.out.println(minmarks);
	}

}
