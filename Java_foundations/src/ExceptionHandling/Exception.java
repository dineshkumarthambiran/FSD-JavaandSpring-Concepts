package ExceptionHandling;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5};

		try {
		for(int i = 0;i<arr.length;i++)
		{
			System.out.println(i);
		}
		System.out.println(arr[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}

}
