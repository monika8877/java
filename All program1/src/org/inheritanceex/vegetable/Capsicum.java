package org.inheritanceex.vegetable;

public class Capsicum extends Vegetable {

	public Capsicum() {
		super("Green", "Spicy");
	}

	
	void preparePizza()
	{
		System.out.println("prepare pizzaa");
	}
	
	void clean()
	{
		System.out.println("dip in water");
	}
}
