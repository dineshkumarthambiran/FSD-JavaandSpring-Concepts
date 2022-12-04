package Object_intantiation;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal lion = new Lion();
		
		lion.eat();
		
		Animal Tiger = new Animal(){

			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("Tiger is eating");
				
			}

			@Override
			public void sleep() {
				// TODO Auto-generated method stub
				System.out.println("Tiger is Sleeping");
				
			}

	};

		Tiger.eat();
}
}
