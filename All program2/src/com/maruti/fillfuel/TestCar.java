package com.maruti.fillfuel;

public class TestCar {
	public static void main(String[] args) {
		Car c = new Car();
		Diesel d = new Diesel();
		c.fill(d);
		ElectricCharge ec = new ElectricCharge();
		c.fill(ec);
	}

}
