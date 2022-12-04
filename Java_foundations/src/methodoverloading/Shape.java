package methodoverloading;
import java.util.Scanner;

public class Shape {
	
	
//	double result;
	Scanner s = new Scanner(System.in);

//	circle
	public void area() {
		float pi = 3.14f;
		System.out.println("input radius");
		float radius = s.nextFloat();
		float result = pi * radius*radius;
		System.out.println("Area of circle"+result);
			
	}
	
//square
	public void area(Float side) {
		System.out.println("input side of square");
//		float sides = s.nextFloat();
		float result =side * side;
		System.out.println("Area of square"+result);
			
	}
	
//rectangle
	public void area(float len,float bre) {
		float result =len * bre;
		System.out.println("Area of rectangle"+result);
	}
	
	//triangle
		public void area(double base,double height) {
			double result =base * height*0.5;
			System.out.println("Area of triangle"+result);
		}	

}
