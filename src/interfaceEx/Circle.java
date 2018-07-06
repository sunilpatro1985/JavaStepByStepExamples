package interfaceEx;

public class Circle implements Shape{
	double Area;
	double pi = 3.14;
	double radius;

	@Override
	public double calcArea() {
		Area = pi * radius * radius;
		return Area;
	}

	@Override
	public String GetColor() {
		return "Green";
	}

	@Override
	public void DispColor() {
		System.out.println(GetColor());		
	}

	@Override
	public void DispArea() {
		System.out.println(calcArea());
	}
	
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.radius = 4;
		circle.GetColor();
		circle.DispColor();
		circle.DispArea();
		
	}

}
