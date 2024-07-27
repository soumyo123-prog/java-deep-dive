package day1;

// The very basic form of a class in JAVA.
class Car {
	String brand;
	String model;
	int year;
}

public class ClassesAndObjects {

	public static void main(String[] args) {

		// Instantiating a class.
		Car car1 = new Car();

		// Changing the properties of the car1 object.
		car1.brand = "Ford";
		car1.model = "Focus";
		car1.year = 2022;

		// Printing out the properties. String.format, as the name suggests
		// populates the string with the given arguments, in places where '%x'
		// is used.
		System.out.println(String.format("%s %s %d", car1.brand, car1.model, car1.year));

	}

}
