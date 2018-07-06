package inheritanceEx;

public class Animals {
	int NoOfEyes = 2;
	
	Animals(){
		System.out.println("Animals : -");
	}

	public void Eat() {
		System.out.println("I can eat");
	}
	
	public void Eyes() {
		System.out.println("I have "+ NoOfEyes + " eyes");
	}
}
