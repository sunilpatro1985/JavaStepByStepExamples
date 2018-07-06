package mypackage;

public class Dog extends Animal{
	
	Dog(){
		//super();
		System.out.println("Dog :-");
	}
	
	/*No need to write below methods here,
	 * as we are inheriting them from Animal Class
	void eat() {
		System.out.println("I can eat");
	}
	
	void eyes() {
		System.out.println("I have 2 eyes");
	}
	*/
	
	void Bark(){
		System.out.println("I can bark");
	}

}
