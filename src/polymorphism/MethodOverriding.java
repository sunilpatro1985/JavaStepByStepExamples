package polymorphism;

public class MethodOverriding {

	public static void main(String[] args) {
		//BaseClass bc = new BaseClass();
		BaseClass bc = new ChildClass();
		bc.DispClass();
	}
}

//Object - extreme parent class of all classes in java

class BaseClass{
	void DispClass() {
		System.out.println("BaseClass");
	}
}

class ChildClass extends BaseClass{
	void DispClass() { //method sugnature should be same as parent class
		System.out.println("ChildClass");
	}
}
