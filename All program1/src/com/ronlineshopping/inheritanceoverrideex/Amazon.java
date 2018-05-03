package com.ronlineshopping.inheritanceoverrideex;

public class Amazon extends Website {
	
	public Amazon(String url, int ipAdress) {
		super(url,ipAdress);
	}

	void amazonPay()
	{
		System.out.println("Pay with amazon balance");
	}
	
	void deliver()
	{
		System.out.println("Deliver with Amazon Delivery");
	}

}
