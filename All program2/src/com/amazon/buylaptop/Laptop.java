package com.amazon.buylaptop;

public class Laptop {

	String brand;
	String Color;
	int hddCapacity;
	double price;
	double screenSize;

	Laptop(double price) {
		this.price = price;
		this.brand = "Dell";
		this.Color = "Blue";
		this.screenSize = 14.5;
		this.hddCapacity = 500;
		this.disp();

	}

	Laptop(double screenSize, String brand) {
		this.brand = brand;
		this.Color = "Black";
		this.hddCapacity = 1000;
		this.price = 35000;
		this.screenSize = screenSize;
		this.disp();

	}

	Laptop(String brand, String color, int hddCapacity, double price,
			double screenSize) {
		this.brand = brand;
		this.Color = color;
		this.hddCapacity = hddCapacity;
		this.price = price;
		this.screenSize = screenSize;
		this.disp();
	}

	public Laptop(String color) {
		this.Color = color;
		this.brand = "Apple";
		this.hddCapacity = 250;
		this.price = 68000;
		this.screenSize = 13.5;
		this.disp();
	}

	void disp() {
		System.out.println(this.brand + " " + this.Color + " "
				+ this.hddCapacity + " " + this.price + " " + this.screenSize);
	}

	public static void main(String[] args) {

		Laptop l1 = new Laptop(55000);
		Laptop l2 = new Laptop(12.5,"Acer");
		Laptop l3 = new Laptop("Samsung", "Silver", 350, 34000, 15.5);
		Laptop l4 = new Laptop("Red");
	}

}
