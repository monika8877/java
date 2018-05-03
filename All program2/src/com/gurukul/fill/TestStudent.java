package com.gurukul.fill;

public class TestStudent {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		Coffee c = new Coffee();
		Juice ju = new Juice();
		s.drink(c);
		s.drink(ju);
		
	}

}
