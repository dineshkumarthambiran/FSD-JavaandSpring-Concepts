package FileHandlind.WritingIntoFIle;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WritingUSingBufferOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedOutputStream bos = null ;
		String message ;
		
		Scanner s = new Scanner(System.in);
		
		try {
			bos = new BufferedOutputStream(new FileOutputStream("C:\\\\\\\\Users\\\\\\\\dines\\\\\\\\OneDrive\\\\\\\\Desktop\\\\\\\\File.txt"));
			System.out.println("Enter the content");
			message = s.nextLine();
			
			
			bos.write('\n');
			bos.write(message.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
