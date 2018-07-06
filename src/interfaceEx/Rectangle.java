package interfaceEx;

public class Rectangle implements Shape{

	double Area;
	double length;
	double breath;
	
	@Override
	public String GetColor() {
		return "Green";
	}

	@Override
	public double calcArea() {
		Area = length * breath;
		return Area;
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
		Rectangle rect = new Rectangle();
		rect.length = 5;
		rect.breath = 10;
		rect.DispArea();
		rect.DispColor();
	}
}
