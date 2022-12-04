package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class NestedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream  fis = null;
		 String file1 = "C:\\Users\\dines\\OneDrive\\Desktop";
		  String file2="C:\\Users\\dines\\OneDrive\\Desktop";
		try
		{
		  fis = new FileInputStream(file1);
		System.out.println("File1 is opened");
		
		}
		catch(FileNotFoundException e) {
			System.out.println("if file is not found open file 2");
		}
		try {
		
			  fis = new FileInputStream(file2);
		
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try
			{	fis.close();
				System.out.println("file1 has been closed");
			}
			catch(IOException e)
			{
				System.out.println(e.getMessage());
			}
			
		}
	}
	
		openfile();
		
	}

