package org.NWSpringdemo.SpringDemo;

public class Car {
	
	String Model;
	int year;
	String Color;
	
	public Car(String model, int year, String color) {
		super();
		Model = model;
		this.year = year;
		Color = color;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Car [Model=" + Model + ", year=" + year + ", Color=" + Color + "]";
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
	
	
	
	
	

}
