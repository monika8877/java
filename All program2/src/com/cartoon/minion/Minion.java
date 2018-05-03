package com.cartoon.minion;

public class Minion {
	String name = "Minion";
	String colour = "Yellow";
	int noOfLegs = 2;
	int noOfHands = 2;
	double height = 3;

	void sleep() {
		System.out.println("Minion Sleep");
	}

	void talk() {
		System.out.println("Minion Seat");
	}

	void walk() {
		System.out.println("Minion Walk");
	}

	public static void main(String[] args) {
		Minion m1 = new Minion();
		Minion m2 = new Minion();
		m2.name = "Stuart";
		m2.height = 3.2;

		System.out.println(m2.name);// Stuart
		m1.walk();

	}
}
