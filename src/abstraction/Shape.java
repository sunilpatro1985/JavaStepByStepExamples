package abstraction;

public abstract class Shape {
	
	String Color;
	double Area;
	
	Shape(String Color){
		this.Color = Color;
		System.out.println("Color of shape - " + this.Color);
	}
	
	abstract double calcArea();
	
	void DispArea(double Area){
		this.Area = Area;
		System.out.println("Area - " + this.Area);
	}
	
}
