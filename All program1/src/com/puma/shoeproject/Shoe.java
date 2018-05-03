package com.puma.shoeproject;

public class Shoe {

	String color;
	String material;
	int size;
	String brand = "Puma";

	Shoe(int size) {
		this.size = size;
		this.color = "Black";
		this.material = "Leather";
		this.show();
	}

	Shoe(String color, int size) {
		this.color = color;
		this.size = size;
		this.material = "Polymer";
		this.show();
	}

	Shoe(String color, String material, int size) {
		this.color = color;
		this.material = material;
		this.size = size;
		this.show();
	}

	void show() {
		System.out.println(this.brand + " " + this.color + " " + this.material
				+ " " + this.brand);
	}

	public static void main(String[] args) {

		Shoe s1 = new Shoe(6);
		Shoe s2 = new Shoe("Black", 7);
		Shoe s3 = new Shoe("Jeans", "Red", 5);
	}

}
