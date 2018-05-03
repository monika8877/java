package com.zoo.animal;

public class Cow extends Animal {
	
	public Cow(String color, String type) {
		super(color, type);
	}

	void giveMilk()
	{
		System.out.println("It gives milk");
	}

}
