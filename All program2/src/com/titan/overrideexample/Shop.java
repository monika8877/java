package com.titan.overrideexample;

import java.util.Random;

public class Shop {
	
	Jewel sell()
	{
		Random r = new Random();
		int n = new Random().nextInt(3)+1;
		if (n==1)
			return new Ring();
		else if(n==2)
			return new Chain();
		else if(n==3)
			return new Bracelet();
		else
			return null;
	}


}
