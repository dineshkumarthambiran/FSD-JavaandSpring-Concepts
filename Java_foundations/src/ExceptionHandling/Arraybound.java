package ExceptionHandling;

import java.util.Scanner;

public class Arraybound {
	static String [] results = {"Dinesh","dk","vignesh"}; 
	
	public static String getARecord(int index)
	{
		String recordtoretrieve = "";
		try
		{
			recordtoretrieve=results[index];
			
			System.out.println(recordtoretrieve);
			
			
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Record not found");
		}
		return recordtoretrieve;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the index for the data to be searched");
		int index =  s.nextInt();
		getARecord(index);
//		String aRecord = getARecord(index);
//		System.out.println(aRecord);
			
		
		
	}
	
}
