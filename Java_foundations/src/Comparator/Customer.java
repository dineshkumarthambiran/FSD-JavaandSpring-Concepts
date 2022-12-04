package Comparator;

public class Customer {
	
	int id;
	String name;
	int bal;
	public Customer(int id, String name, int bal) {
		super();
		this.id = id;
		this.name = name;
		this.bal = bal;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", bal=" + bal + "]";
	}
	
	
	
	

}
