package polymorphism;

public class MethodOverloading {

	static void add(int a, int b) { //method signature should be unique
		int c = a+ b;
		System.out.println("Add " + a + " + " + b + " = "+ c);
	}
	
	static void add(double d, double e) {
		double c = d + e;
		System.out.println("Add " + d + " + " + e + " = "+ c);
	}
	
	static void add(String a, String b) {
		System.out.println(a + b);
	}
	
	public static String GetDetails(String d) {
		return d;
	}
	
	public static int GetDetails(int f) {
		return f;
	}
	
	public static void main(String[] args) {
		//System.out.println();
		add(2,3);
		add(3.4, 5.88);
		add("qa", "validation");
	}
}
