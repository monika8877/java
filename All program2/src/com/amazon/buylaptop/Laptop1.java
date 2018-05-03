package com.amazon.buylaptop;

public class Laptop1 {
	
	String brand;
	double screenSize;
	String color;
	int price;
	int hddCapacity;
	
	Laptop1(int price)
	{
		this(price, "Blue", "Dell", 14.5, 500);
		
	}
	
	Laptop1(double screenSize, String brand)
	{
		this(35000, "Black", brand,screenSize,10000);
	}
	
	Laptop1(String color)
	{
		this(68000, color, "Apple", 13.5, 250);
	}
	Laptop1(int price, String color, String brand , double screenSize,
			int hddCapacity) {
		this.brand = brand;
		this.screenSize = screenSize;
		this.color = color;
		this.price = price;
		this.hddCapacity = hddCapacity;
		this.disp();
	}
	
	void disp()
	{
		System.out.println(this.price+ " "+ this.color+ " "+ this.brand+" "+ this.screenSize+ " "+ this.hddCapacity);
	}
	
	public static void main(String[] args) {
		
		Laptop1 l = new Laptop1(30000);
		
		Laptop1 l2 = new Laptop1("Silver");
		
		Laptop1 l3 = new Laptop1(12.5,"Lenevo");
	}

	
	
}
