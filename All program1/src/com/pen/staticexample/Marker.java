package com.pen.staticexample;

public class Marker {
	
	static String brand = "Camlin";
	String color;
	
	Marker(String color)
	{
		this.color = color;
	}
	
	public static void main(String[] args) {
		System.out.println(Marker.brand);
		Marker m = new Marker("Red");
		System.out.println(m.color);
		Marker m2 = new Marker("Blue");
		System.out.println(m2.color);
		Marker m3 = new Marker(null);
		System.out.println(m3.color);
		Marker m4 = new Marker("Purple");
		System.out.println(m4.color);
		
		
	}

}
