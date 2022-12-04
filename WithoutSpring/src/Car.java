
public class Car {
	
	engine engine;
	tyre tyre;
	String model;
	String color;
	
	
	
	public void displaycardet() {
		
		System.out.println("car color"+color);
		System.out.println("car model"+model);
		System.out.println("tyre details");
		tyre.displaytyre();
		System.out.println("car details");
		engine.displayengine();
	
	
	}



	public Car(engine engine, tyre tyre, String model, String color) {
		super();
		this.engine = engine;
		this.tyre = tyre;
		this.model = model;
		this.color = color;
	}

}
