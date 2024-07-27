package day1;

class Rectangle {
	int width;
	int height;

	// Type 1: Default constructor.
	public Rectangle() {
		System.out.println("Default constructor getting called");
		this.width = 0;
		this.height = 0;
	}

	// Type 2: Parameterized constructors.
	public Rectangle(int width, int height) {
		System.out.println("Constructor with two parameters getting called");
		this.width = width;
		this.height = height;
	}

	// Similar to type 2: Constructor with a single parameter
	public Rectangle(int side) {
		System.out.println("Constructor with one parameter getting called");
		this.width = side;
		this.height = side;
	}

	// Type 3: Copy constructor. Other languages such as C++ provide built-in
	// copy constructor for any class. In JAVA, we have to define it by ourselves.
	public Rectangle(Rectangle makeCopyOf) {
		System.out.println("Copy constructor getting called");
		this.width = makeCopyOf.width;
		this.height = makeCopyOf.height;
	}
}

// For constructor chaining.
class Employee {
	String name;
	int id;
	String department;

	public Employee(String name, int id, String department) {
		System.out.println("Calling the three parameter constructor");
		this.name = name;
		this.id = id;
		this.department = department;
	}

	public Employee(String name, int id) {
		this(name, id, "General");
	}

	public Employee(String name) {
		this(name, 0);
	}
}

public class Constructors {

	public static void main(String[] args) {

		// Run this program to see the inputs.

		// Calling default constructor.
		Rectangle r1 = new Rectangle();

		// Calling parameterized constructors.
		Rectangle r2 = new Rectangle(1, 1);
		Rectangle r3 = new Rectangle(16);

		// Calling copy constructor.
		Rectangle r4 = new Rectangle(r2);
		System.out.println(r2.height == r4.height);

		// Exploring constructor chaining.
		Employee e1 = new Employee("John Doe", 1, "IT");
		Employee e2 = new Employee("Jane Doe", 2);
		Employee e3 = new Employee("Jana Doe");

	}

}
