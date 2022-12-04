package org.NWSpringdemo.BeanScope;

public class Bike {
	
	String model;
	String color;
	String owner;
	
	public Bike(String model, String color, String owner) {
		super();
		this.model = model;
		this.color = color;
		this.owner = owner;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	 
	

}
