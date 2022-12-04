package java8Features.ConvertingarraytoStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraytoStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] marks = {21,22,23,24};
		
		Integer[] array = Stream.of(marks).filter(m->m<22).toArray(Integer[]::new);
//		converting list to array
		List <Integer> markslist = Arrays.asList(43,22,45,56);
		Integer[] marksArray = markslist.stream().toArray(Integer[]::new);
		
//	array into stream
		List<Integer> markslistfromarray = Stream.of(marks).collect(Collectors.toList());
	}

}