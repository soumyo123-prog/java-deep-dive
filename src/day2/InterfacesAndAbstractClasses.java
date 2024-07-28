package day2;

// Basically, a blueprint for defining class properties and methods.
interface Vehicle {
	int getMaxSpeed();
}

// Defining classes based on interfaces.

class Car implements Vehicle {
	@Override
	public int getMaxSpeed() {
		return 120;
	}
}

class Truck implements Vehicle {
	@Override
	public int getMaxSpeed() {
		return 80;
	}
}

// Abstract classes contain abstract methods and normal methods.
// Abstract methods need to be overridden while creating an object of
// an abstract class.

abstract class Population {
	abstract int getMax();

	void jump() {
		System.out.println("Everyone is jumping");
	}
}

public class InterfacesAndAbstractClasses {

	public static void main(String[] args) {

		// Creating an anonymous inner class (objects of these classes can be
		// created only once).
		Population indian = new Population() {
			@Override
			int getMax() {
				return 100000;
			}
		};

		System.out.println(indian.getMax());
		indian.jump();

	}

}
