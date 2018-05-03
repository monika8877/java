package com.zoo.animal;

public class TestAnimal {

	public static void main(String[] args) {

		 Cow c = new Cow("Black","Domestic");
		 System.out.println( c.color+ " " +c.type); 
		 System.out.println(c);

		// Animal a = c;
		// System.out.println(a);// we will get fully classified pkg name and
		// @hash code

		// c.giveMilk();
		// a.giveMilk();///by using upcasting we cannot access sub class method
		// , this is the example (can't access because is a subclass specific
		// method

		Zoo z = new Zoo();
		Animal a = z.sell();// upcasting because the method will return //
							// either cat,lion or cow objectC
		// System.out.println(a);//it will give fully classified class name of animal
		if (a != null) {
			a.eat();
		} else {
			System.out.println("No animal to eat");
		}
	}

}
