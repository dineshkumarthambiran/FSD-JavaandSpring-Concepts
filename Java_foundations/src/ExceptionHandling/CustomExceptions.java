package ExceptionHandling;

import java.io.IOException;


public class CustomExceptions {
	
	
	
	public static void findarecord(int sid)throws idnotFound  {
		
//			
//		if (sid>50)
//		{
//			throw new IOException("record not found");
//		}
//		
		if (sid>50)
			
		{
			throw new idnotFound("record not found");
			
		}
			
		
		
		
	}
	
	public static void main(String[] args) {
		try
		{
			findarecord(60);
		}
		catch(idnotFound e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
