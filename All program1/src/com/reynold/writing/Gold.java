package com.reynold.writing;

public class Gold {

	double qty;
	double price;
	
	Gold(double qty)
	{
	this.qty = qty;
	this.price = qty*2935.65;
	this.detail();
	}
	
	void detail()
	{
		System.out.println(this.qty + " "+this.price);
	}
	
	public static void main(String[] args) {
		
		Gold g = new Gold(15);
	}
	
	
}
	
	
