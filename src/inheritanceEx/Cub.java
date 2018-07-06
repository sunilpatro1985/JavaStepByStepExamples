package inheritanceEx;
public class Cub extends Lion{
	void Cooing() {
		System.out.println("Sound of Cub - Coo");
	}

	public static void main(String[] args) {
		Cub cub = new Cub();
		//super(); //error - should be 1st line of the method
		cub.Eat();
		cub.Eyes();
		cub.Cooing();
	}
}
//super() - refers to parent constructor
