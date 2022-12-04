package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException {
	
	public static void main(String[] args) {
		
		try
		{
			FileInputStream fis = new FileInputStream("desktop/myfile");
			fis.read();
			Thread.sleep(1000);
			
		}
//		catch(FileNotFoundException e)
//		{
//			System.out.println(e.getMessage());
//		}
//		catch(IOException e)
//		{
//			System.out.println(e.getMessage());
//		}
//		catch(InterruptedException e)
//		{
//			System.out.println(e.getMessage());
//		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
