package day2;

class MulticellularOrganism {
	public void die() {
		System.out.println("The organism has died");
	}
}

class Animal extends MulticellularOrganism {
	String name;

	Animal(String name) {
		this.name = name;
	}

	public void walk() {
		System.out.println("The animal is walking");
	}

	// Method overriding. Resolves during runtime.
	@Override
	public void die() {
		System.out.println("The animal has died");
	}
}

class Dog extends Animal {
	Dog(String name) {
		// Calls the constructor of the immediate parent class. In this case,
		// it would be the 'Animal' class.
		super(name);
	}

	public void bark() {
		System.out.println("Barking now.");
	}

	// Method overloading with different parameters.
	// Overloading resolves during compile-time.
	public void bark(String whatToSay) {
		System.out.println(whatToSay);
	}
}

public class Inheritance {

	public static void main(String[] args) {

		Dog dog1 = new Dog("Ron");

		dog1.bark();
		dog1.bark("Hello owner!");
		dog1.die(); // Resolves to the nearest parent class. In this case, the Animal class.
		dog1.walk();

		// Upcasting, happens implicitly.
		MulticellularOrganism dog2 = new Dog("Sammy");

		// Not possible:
		// dog2.bark();

		// Downcasting, have to do explicitly.
		Dog dog3 = (Dog) dog2;
		dog3.bark();

	}

}
