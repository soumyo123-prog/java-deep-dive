package day1;

class Laptop {
	// Encapsulating the properties inside a class is a good practice.
	private String brand;
	private String model;
	private int year;

	// Setting up getters and setters for accessing the properties.

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// Overriding some inbuilt class methods.

	@Override
	public String toString() {
		return String.format("%s %s %d", this.brand, this.model, this.year);
	}

	@Override
	public boolean equals(Object obj) {
		// Cast or 'convert' the object to Laptop class.
		Laptop laptop = (Laptop) obj;

		// Compare the relevant fields
		return (this.brand == laptop.getBrand() && this.model == laptop.getModel() && this.year == laptop.getYear());
	}

	// Defining other functions.

	public void switchOn() {
		System.out.println("The laptop is now switching ON");
	}

	public void switchOff() {
		System.out.println("The laptop is not switching OFF");
	}

}

public class Methods {

	public static void main(String[] args) {

		Laptop l1 = new Laptop();
		Laptop l2 = new Laptop();

		// Using getters and setters.
		l1.setBrand("Lenovo");
		l1.setModel("Thinkpad");
		l1.setYear(2024);
		System.out.println(l1.getBrand());
		System.out.println(l1.getModel());
		System.out.println(l1.getYear());

		l2.setBrand("Lenovo");
		l2.setModel("Thinkpad");
		l2.setYear(2024);

		// Using inbuilt class methods.

		// In the below print statement, you will get an output as follows:
		// 'Lenovo Thinkpad 2024'. But, if you don't override the toString method
		// you will get a different output.
		System.out.println(l1.toString());

		// In the below print statement, you will get an output as true, which
		// would have been false if you did'nt override the equals method. You can
		// try this by commenting the overriding.
		System.out.println(l1.equals(l2));

		// Using our own functions.
		l1.switchOn();
		l1.switchOff();
	}

}
