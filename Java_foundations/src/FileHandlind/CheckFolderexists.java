package FileHandlind;

import java.io.File;
import java.util.Scanner;

public class CheckFolderexists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path = "C:\\Users\\dines\\OneDrive\\Desktop\\new";
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of folders to be created");
		int nooffile = s.nextInt();		
		
//		for creating number of subfolder inside one another
//		
//		for (int i = 1 ; i<=nooffile ; i++)
//		{
//			path = path +"\\sub"+i;
//		}
//		
//		File file = new File(path);
//		file.mkdirs();
		
		
//		tis is for created many sub folders inside one folder
		
		for (int i = 1 ; i<=nooffile ; i++)
		{
			File file = new File(path+"\\sub"+i);
			file.mkdirs();
		}
		
		System.out.println("Folders created");
		
							

	}

}
