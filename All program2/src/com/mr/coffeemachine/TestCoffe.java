package com.mr.coffeemachine;

public class TestCoffe {
	public static void main(String[] args) {
		CoffeeMachine c = new CoffeeMachine();
		Water w = new Water();
		CoffeeBean cb = new CoffeeBeen();
		Coffee espresso = c.prepareCoffee(w,cb);
	}

}
