package abstraction;

public class Rectangle extends Shape{

	double Area;
	double length;
	double breath;
	
	Rectangle(String Color) {
		super(Color);
	}

	@Override
	double calcArea() {
		Area = length * breath;
		return Area;
	}
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle("Red");
		rect.length = 5;
		rect.breath = 10;
		
		rect.DispArea(rect.calcArea());
		
	}

}
