package com.ronlineshopping.inheritanceoverrideex;

public class PayTm extends Website {
	
	public PayTm(String url, int ipAdress) {
		super(url, ipAdress);
	}

	void bookMovieTicket()
	{
		System.out.println("Buy any new movie ticket from paytm");
	}

}
