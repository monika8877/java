package com.groffers.fruitexample;

public class Fruit {
	String color;
	int price;
	
	void clean()
	{
		System.out.println("Clean and Slice");
	}
	
	void prepareJuice()
	{
		this.clean();
		System.out.println("Add to mixer and crush");
	}
	

}
