package mypackage;


/*
 * Animal is parent / super class
 * Dog and Lion are child classes of Class Animal
 */

public class MainM {

	public static void main(String[] args) {
		Dog dog = new Dog(); //Dog method will execute from Class Dog
		//dog.nameAnimal(); //can't access as this method in parent class is private
		dog.eat();
		dog.Bark();
		dog.eyes(); //child class can use protected methods from parent / super class
		
		Lion lion = new Lion(); //Lion method will execute from Class Lion
		lion.eat();
		lion.eyes();
		lion.Roar();
		
		//bark is common to dog only
		//roar is common to lion only
	}

}
