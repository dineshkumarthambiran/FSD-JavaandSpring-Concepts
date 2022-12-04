package FileHandlind.StreamBasedInput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingFISUSingByteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fis = null ;
		
		try {
			fis = new FileInputStream("C:\\\\Users\\\\dines\\\\OneDrive\\\\Desktop\\\\File.txt");
			byte b[] = new byte [fis.available()];
			fis.read(b);
					
			System.out.println(new String(b));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
