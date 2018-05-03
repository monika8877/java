package com.symphony.blowfunction;

public class TestCooler {
	
	public static void main(String[] args) {
		System.out.println("Cooler is present");
		Cooler c = new Cooler();
		System.out.println("Filling the cooler");
		c.cool(new ColdWater());
		System.out.println("Recieved Air");
	}

}
