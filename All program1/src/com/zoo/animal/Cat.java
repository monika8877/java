package com.zoo.animal;

public class Cat extends Animal {
	
	public Cat() {
		super("Black", "Carnivores");// or super(color,type)--by using this customer gives their requirement
	}

	void scratch()
	{
		System.out.println("It has behavior of Scratch");
	}

}
