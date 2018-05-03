package com.titan.overrideexample;

public class Person {
	
	void purchase()
	{
		Shop s = new Shop();
		Jewel j = s.sell();//kaise call kiye isko
		if(j!= null)
		{
			j.polish();
			
			if(j instanceof Ring){///here we used downcasting because without downcast we can not access subclass method with superclass
		    Ring r = (Ring)j;
		    r.wearToFinger();//to access this method we used downcasting
			}
			else if(j instanceof Chain){
				Chain c = (Chain)j;
				c.wearToNeck();
			}
			
			else if(j instanceof Bracelet)
			{
				Bracelet b = (Bracelet)j;
				b.wearToHand();
			}
			else{
				System.out.println("No jewel at this time");
			}
		    
			
		}
	}

}
