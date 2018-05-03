package com.ronlineshopping.inheritanceoverrideex;

public class Person {

	void purchase() {
		OnlineShop s = new OnlineShop();
		Object o = s.sell();

		if (o instanceof Amazon) {
			Amazon a = (Amazon) o;
			a.amazonPay();
		} else if (o instanceof Flipkart) {
			Flipkart f = (Flipkart) o;
			f.shopGiftCard();
		} else if (o instanceof PayTm) {
			PayTm p = (PayTm) o;
			p.bookMovieTicket();
		}

		else {
			System.out.println("No websites");
		}
	}

	public static void main(String[] args) {
		Person p = new Person();
		p.purchase();
//		Website w = new Website("www.website.com", 134567);
//		w.show();
//
		// Amazon a = new Amazon("www.fgseyfgw.com", 56745);
		// a.deliver();

	}
}
