package inheritanceEx;

public class Cat extends Animals{
	
	void Meow() {
		System.out.println("Sound of cat - Meow");
	}

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.Eat();
		cat.Eyes();
		cat.Meow();
	}

}
