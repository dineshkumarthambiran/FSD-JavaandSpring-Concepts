package FileHandlind.StreamBasedInput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingAFileUsingFIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("C:\\Users\\dines\\OneDrive\\Desktop\\File.txt");
			int ascii;
		while((ascii=fis.read())!=-1)
					{
				System.out.print((char)ascii);
					}
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		finally
		{
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
