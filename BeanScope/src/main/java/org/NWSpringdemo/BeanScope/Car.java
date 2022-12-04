package org.NWSpringdemo.BeanScope;

public class Car {
	
	String Model;
	int year;
	String Color;
	Engine engine;
	
	
	public Car(String model, int year, String color,Engine engine) {
		super();
		Model = model;
		this.year = year;
		Color = color;
		this.engine=engine;
	}
	
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	
	
	@Override
	public String toString() {
		return "Car [Model=" + Model + ", year=" + year + ", Color=" + Color + ", engine=" + engine + "]";
	}
	
	


}
