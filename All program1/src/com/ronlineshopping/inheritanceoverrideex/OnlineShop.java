package com.ronlineshopping.inheritanceoverrideex;

import java.util.Scanner;

public class OnlineShop {

	Object sell() {
		Scanner s = new Scanner(System.in);
		System.out.println("diffrent diffrent url");
		int n = s.nextInt();

		// Random r = new Random();
		// int n = new Random().nextInt(3)+1;

		if (n == 1) {
			return new Amazon("www.amazon.in", 4545345);
		} else if (n == 2) {
			return new Flipkart("www.flipkart.com", 8755787);
		} else if (n == 3) {
			return new PayTm("www.paytm.com", 485346346);
		} else
			return null;

	}

}
