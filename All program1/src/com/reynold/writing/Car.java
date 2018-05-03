package com.reynold.writing;

public class Car {
	String color;
	String brand = "Honda";
	int price;
	int gear;

	void moveForward() {
		System.out.println("move forward feature");
	}

	void disp() {
		System.out.println(this.color + " " + this.brand + " " + this.price);
	}

	void shiftGearUp() {
		if (gear < 5)
			gear += 1;

		System.out.println("Car is running on gear" + gear);

	}

	void shiftGearDown() {
		if (gear > 0)
			gear -= 1;
		System.out.println("Car is running on gear" + gear);
	}

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.color = "Red";
		c1.price = 1500000;
		c1.disp();            //Red Honda 1500000
		c1.shiftGearUp();
		c1.shiftGearUp();
		c1.shiftGearUp();
		c1.shiftGearUp();
		c1.shiftGearUp();
		c1.shiftGearDown();
		c1.shiftGearDown();

		Car c2 = new Car();
		c2.disp();          //null Honda 0

		Car c3 = new Car();
		c3.color = "Silver";
		c3.price = 12000000;
		c3.disp();         //Silver Honda 12000000

	}

}
