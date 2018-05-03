package com.honda.testvehicle;

public class TestVehicle {
	
	public static void main(String[] args) {
		
		Truck t = new Truck();
		t.start();
		
		Car c = new Car();
		c.start();
		
		Bike b = new Bike();
		b.start();
		
		SportsCar s = new SportsCar();
		s.start();
		
		
	}

}
