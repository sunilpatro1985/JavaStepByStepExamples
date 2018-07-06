package mypackage;

public class Animal {
	
	private int noOfeyes = 2;
	
	 Animal() {
		System.out.println("Animal");
	}
	
	void eat() {
		System.out.println("I can eat");
	}
	
	protected void eyes() {
		System.out.println("I have " + noOfeyes + " eyes");
	}

	
}
