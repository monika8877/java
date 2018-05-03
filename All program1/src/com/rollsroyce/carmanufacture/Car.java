package com.rollsroyce.carmanufacture;

public class Car {

	String color;
	String variant;
	String model;
	String brand = "Rolls Royce";

	Car(String color) {
		this.color = color; // here customer passes only "color" so  model and variant is taken by owner itself
		this.model = "Ghost";
		this.variant = "Petrol";
		this.show();
	}

	Car(String color, String model) {
		this.color = color;    //here customer passes only "color and model" so variant is taken by owner itself
		this.variant = "Diesel";
		this.model = model;
		this.show();
	}

	Car(String color, String model, String variant) { 
		this.color = color;
		this.model = model;            //here customer passes "color and model and varaint" 
		this.variant = variant;
		this.show();
	}

	void show() {
		System.out.println(this.model + " " + this.color + " " + this.variant
				+ " " + this.brand);
	}

	public static void main(String[] args) {

		Car c = new Car("Green");

		Car c1 = new Car("Red", "Phantom");

		Car c2 = new Car("Black", "Wdath", "Electric");

	}

}
