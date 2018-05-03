package com.ms.generalization.vehical;

public class TestVehicle {
	
	public static void main(String[] args) {

		
		Car c = new Car();
		c.brand = "Audi";
		c.color = "White";
		c.isACPresent = true;
		c.noOfSeatBelts = 4;
		c.price = 8600000;
		System.out.println(c.brand);
		c.move();
		c.start();
		c.stop();
		c.temperatureControl();
		//Truck t = new Truck();
		//Bike b = new Bike();
	}

}
