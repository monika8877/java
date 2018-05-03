package com.reynold.writing;

public class Mobile {
	
	String brand = "Oppo";
	Double price;
	String colour;
	
	void call()
	{
		System.out.println("It has calling feature");
	}
	
	void text()
	{
		System.out.println("We can test msg");
	
	}
	
	void showDetail()
	{
		System.out.println(this.brand + " " + this.price + " " + this.colour);
	}
	
	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.call();
		m1.text();
		m1.price = 57545.74573;
		m1.colour = "Black";
		m1.showDetail();
		
		Mobile m2 = new Mobile();
		m2.call();
		m2.price = 16400.6363;
		m2.colour = "White";
        m2.showDetail();	
		
		
		
		
	}
	

}
