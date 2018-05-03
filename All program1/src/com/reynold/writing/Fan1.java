package com.reynold.writing;

public class Fan1 {
	
	String color;
	String type;
	int noOfBlades = 3;
	String brand = "Almorand";
	
	void blowAir()
	{
		System.out.println("Blow air");
	}
	
	void showDetails(){
		System.out.println(this.color + " " + this.noOfBlades + " " + this.brand);
	}

	public static void main(String[] args) {
		
		Fan1 f1 = new Fan1();
		f1.color = "Brown";
		f1.showDetails();
		f1.blowAir();
		
		Fan1 f2 = new Fan1();
		f2.showDetails(); // null 3 almornd
		f2.color = "Green";
		f2.showDetails(); // green 3 almorand
		f2.blowAir();  // blow air
		
		
		
		
		
		
	}
}
