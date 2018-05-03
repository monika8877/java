package com.reynold.writing;

public class Marker {
	
	String color;
	int price = 50;
	String barnd = "Reynolds";
	
	public static void main(String[] args) {
		Marker m1 = new Marker();
		Marker m2 = new Marker();
		m1.color = "Red";
		m2.color = "Black";
		System.out.println(m1);  //com.reynold.writing.Marker@514ade37---fully classified Class name
		
		System.out.println(m2);
		
		
		System.out.println(m1.color);
		System.out.println(m2.color);
	}

}
