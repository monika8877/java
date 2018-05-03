package com.ronlineshopping.inheritanceoverrideex;

public class Website {
	
	String url;
	int ipAdress;
	
	void shop()
	{
		System.out.println("buy Shirt");
	}
	
	void deliver()
	{
		System.out.println("Deliver with Indian post");
	}

	public Website(String url, int ipAdress) {
		this.url = url;
		this.ipAdress = ipAdress;
	}
	
	void show()
	{
		System.out.println(url + " " + ipAdress);
	}
}
