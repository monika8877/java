package com.ma.vehicle;

public class Car extends Vehicle {

	boolean isACPresent;

	void tempControl() {
		System.out.println("temp");
	}

	Car() {
		super("White", 100000);
	}
}
