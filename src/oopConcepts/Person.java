package oopConcepts;

public class Person {

	int age;
	int AgeLimit = 60;
	
	void CurrentAge(int age) {
		this.age = age;
		System.out.println("Current age is = "+ age);
	}
	
	int RetPeriodLeft() {
		return AgeLimit - age;
	}
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.CurrentAge(45);
		System.out.println("Ret age left " + p1.RetPeriodLeft() + " years more");
	}
}
