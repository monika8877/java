package com.basics.greetapp;

public class Greetings {
	void  greet(String name){
		System.out.println("Hello " + name);
	}
	
	public static void main(String[] args) {
		Greetings g = new Greetings();
		g.greet("Delta");
	}

}
