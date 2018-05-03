package com.zoo.animal;

public class Animal {
	
	String color;
	String type;
	
	public Animal(String color, String type){
		this.color = color;
		this.type = type;
	}
	
	void sleep()
	{
		System.out.println("It has a behavior of sleep");
	}
	
	void eat()
	{
		System.out.println("It has a behavior of eat");
	}

}
