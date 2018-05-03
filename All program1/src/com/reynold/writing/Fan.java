package com.reynold.writing;

public class Fan {
	
	String color;
	String type;
	int noOfBlades = 3;
	
	public static void main(String[] args) {
		Fan f1 = new Fan();
		Fan f2 = new Fan();
		f1.color = "Red";
		f2.color = "Black";
	    f1.type = "Wall mounted";
	    f2.type = "Table fan";
	    
	    System.out.println(f1.color);
	    System.out.println(f2.color);
	    System.out.println(f1.type);
	    System.out.println(f2.type);
	}
	

}
