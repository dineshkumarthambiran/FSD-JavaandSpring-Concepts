package java8Features.functionalinterface;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			Functionalinterface test= new Functionalinterface() {

				@Override
				public void test1() {
					
					System.out.println("this is functional interface");
				}
				public void test2() {
					Functionalinterface.super.test2();
				}
			
	};
		test.test1();
		test.test2();
		
		
		Citizen user1 = new Citizen();
		
		user1.applyLLR();
	
	}

}
