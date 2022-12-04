package ExceptionHandling.Custom;


public class CustomException2 {
	
	int sid;
	
	public static void findarecord(int sid) throws RecordNotFound  {
		
		if ( sid>50)
		{
			throw new StudentAlreadyExists("RecordNotFound");
		
		}
	}
	
	public static void insertARecord(int sid,String name, String location) throws StudentAlreadyExists {
		
		if ( sid==100)
		{
			throw new StudentAlreadyExists("Recordalreadyexists");
		
		}
		
	}
	
	public static void main(String[] args) {
		
		try
		{
			insertARecord(100,"Dinesh","Chennai");
		}
		catch(StudentAlreadyExists e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
}
