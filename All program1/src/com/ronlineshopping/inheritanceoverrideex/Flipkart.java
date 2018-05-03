package com.ronlineshopping.inheritanceoverrideex;

public class Flipkart extends Website {
	
	public Flipkart(String url, int ipAdress) {
		super(url, ipAdress);
	}

	void shopGiftCard()
	{
		System.out.println("Buy some giftcards for me from flipkart");
	}

}
