package FileHandlind;

import java.io.File;
import java.io.IOException;

public class CheckFileExists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\dines\\OneDrive\\Desktop\\New1");
		
		if(file.exists()) {
			System.out.println("file is found");
			if(!file.isDirectory())
			{
			System.out.println("it is a file");
			}
			else
			{
				System.out.println("it is a directory");
			}
							
			}
		else
		{
			System.out.println("file / folder not found");
			try
			{
				file.createNewFile();
				file.mkdir();
				System.out.println("file created successfully");
			}
			catch(IOException e)
			{
				System.out.println(e.getMessage());
			}
			
			
			
		}

	
		
	}

}
