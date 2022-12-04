package java8Features.Lamdaexpress;

public class MainClassLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionInterlambda test = (String A) -> {
			System.out.println(A);
		};
		
		test.showmess("hello");
		
		Interface1 obj1 =  int A -> System.out.println(A.length
				)
				;

		

	}

}
