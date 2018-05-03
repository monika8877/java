package com.musuem.auctionproject;

import java.util.Scanner;

public class Musuem {
	Object auction() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name");
		String nameOfItem = s.next();
		if (nameOfItem.equalsIgnoreCase("Coin")) {
			return new Coin();

		}

		else if (nameOfItem.equalsIgnoreCase("Sword")) {
			return new Sword();

		}

		else if (nameOfItem.equalsIgnoreCase("Car")) {
			return new Car();
		} else {
			return null;
		}

	}

}
