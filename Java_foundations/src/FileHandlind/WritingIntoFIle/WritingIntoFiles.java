package FileHandlind.WritingIntoFIle;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WritingIntoFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileOutputStream fos1 = null;
		FileOutputStream fos2 = null;
		Scanner s = new Scanner(System.in);
		String message1;
		String message2;
		
		try {
//	type 1 with ascii		
			fos1 = new FileOutputStream("C:\\\\Users\\\\dines\\\\OneDrive\\\\Desktop\\\\File.txt",true);
			System.out.println("Enter the content");
			message1 = s.nextLine();
			
			fos1.write('\n');
			
			for (int i = 0;i<message1.length();i++)
			{
				fos1.write((int)message1.charAt(i));
			}
			
//type 2 with byte array
			
			fos2 = new FileOutputStream("C:\\\\Users\\\\dines\\\\OneDrive\\\\Desktop\\\\File.txt",true);
			System.out.println("Enter the content");
			message2 = s.nextLine();
			
			fos1.write('\n');
			fos2.write(message2.getBytes());
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
