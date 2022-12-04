package FileHandlind.StreamBasedInput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingfileUsingBufferInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedInputStream bis1 =null ;
		BufferedInputStream bis2 = null;
		
		try {
//type 1 reading one by one	by ascii		
			int ascii;
			bis1 = new BufferedInputStream(new FileInputStream("C:\\\\Users\\\\dines\\\\OneDrive\\\\Desktop\\\\File.txt"));
			while((ascii =bis1.read())!=-1)
			{
				System.out.println((char)ascii);
			}
			
//type 2 using ByteArray			
			bis2 = new BufferedInputStream(new FileInputStream("C:\\\\Users\\\\dines\\\\OneDrive\\\\Desktop\\\\File.txt"));
			byte b[] = new byte [bis2.available()];
			bis2.read(b);
					
			System.out.println(new String(b));
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				bis1.close();
				bis2.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
