package com.tv.serial;

import java.util.Random;

public class Lamp {

	Object	heatUp()
   {
	 
   Random r = new Random();
   int num = r.nextInt(5) + 1;
	
	   switch (num) {
	case 1: return new Genie();
	
	
	case 2: return new Mini();
	
	default:
		return null;
		
	}
}

}
