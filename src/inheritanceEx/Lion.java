package inheritanceEx;

public class Lion extends Animals{

	void Roar() {
		System.out.println("Sound of lion - Roar");
	}

	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.Eat();
		lion.Eyes();
		lion.Roar();
		//lion.Meow(); //no relation between cat and lion
	}

}
