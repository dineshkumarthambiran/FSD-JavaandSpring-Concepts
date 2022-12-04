package abstraction;

public class Lion extends Animal {
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("lion is eating");
	}

	@Override
	public void Sleep() {
		// TODO Auto-generated method stub
		System.out.println("lion is sleeping");
	}
	
	public static void main(String[] args) {
		Lion Lion = new Lion();
		Lion.eat();
		Lion.Sleep();
	}

}
