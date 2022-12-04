package FileHandlind;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreatingMultiplefile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		String path = "C:\\Users\\dines\\OneDrive\\Desktop";
		
		String filename = "";
		
		File folder = new File (path);
		
		if(!folder.exists())
		{
			folder.mkdir();
			System.out.println("Folder not found , hence created");
			
		}
		
		int nooffiles = s.nextInt();
		
		for(int i=1;i<=nooffiles;i++)
		{
			filename =  s.next();
			folder = new File (path + "//"+filename) ;
			
			try {
				folder.createNewFile();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		
		}
		System.out.println("All required files created");
	}

}
