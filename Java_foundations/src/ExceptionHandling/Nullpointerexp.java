package ExceptionHandling;

public class Nullpointerexp {
	
	public static void multipleoperation(String message){
		Integer[] arr = {10,20,30,40};
		
		try
		{
			System.out.println(arr[2]);
			System.out.println(message.length());
			System.out.println(arr[0]/0);
		}		
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println(e.getMessage());
//		}
//		catch(ArithmeticException e)
//		{
//			System.out.println(e.getMessage());
//		}
//		catch(NullPointerException e)
//		{
//			System.out.println(e.getMessage());
//		}
//		catch(RuntimeException e)
//		{
//			System.out.println(e.getMessage());
//		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		multipleoperation(null);
	}

}
