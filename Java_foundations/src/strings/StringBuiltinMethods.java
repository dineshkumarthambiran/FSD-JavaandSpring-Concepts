package strings;

public class StringBuiltinMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String msg = "Hello world";
//		
//	
//		
//		System.out.println("Element at 1st index"+msg.charAt(1));
//		System.out.println("element at mid index"+(msg.charAt(msg.length())));
		
		String name1="Vignesh";
		String name2="Vineeth";
		if (name1.compareTo(name2)==0)
		{
			System.out.println("both the names are equal");
		}
		else if(name1.compareTo(name2)<0)
		{
			System.out.println("Second string is bigger than first");
		}
		else
		{
			System.out.println("first string is bigger than second");
		}
		
		
		
	}

}
