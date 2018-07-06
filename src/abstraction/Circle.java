package abstraction;

public class Circle extends Shape{

	double Area;
	double pi = 3.14;
	double radius;
	
	Circle(String Color) {
		super(Color);
	}

	@Override
	double calcArea() {
		Area = pi * radius * radius;
		return Area;
	}
	
	public static void main(String[] args) {
		Circle circle = new Circle("Green");
		circle.radius = 5;
		
		circle.DispArea(circle.calcArea());
	}

}
