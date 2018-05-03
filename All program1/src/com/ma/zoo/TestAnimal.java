package com.ma.zoo;

public class TestAnimal {
	
	public static void main(String[] args) {
		
		Lion l = new Lion();
		l.roar();
		l.color = "Brown";
		System.out.println(l.color);
		l.sleep();
		Animal a  = new Animal();
		a.eat();
		a.color = "White";
		System.out.println(a.color);
		Carnivores c = new Carnivores();
		c.kill();
	}

}
