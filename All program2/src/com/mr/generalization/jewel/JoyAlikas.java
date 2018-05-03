package com.mr.generalization.jewel;

import java.util.Random;

public class JoyAlikas {

	Jewel luckyDip() {

		Random r = new Random();
		int x = r.nextInt(3);
		if (x == 1) {
			return new Ring();
		} else if (x == 2) {
			return new Chain();
		} else if (x == 3) {
			return new Bracallet();
		} else
			return null;

	}

	public static void main(String[] args) {

		JoyAlikas ja = new JoyAlikas();
		Jewel j = ja.luckyDip();
		System.out.println(j);
	}

}
