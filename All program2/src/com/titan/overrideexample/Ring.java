package com.titan.overrideexample;

public class Ring extends Jewel {
	
	void wearToFinger()
	{
		System.out.println("Wear ring");
	}
	
	@Override
	void polish()
	{
		System.out.println("Polish using brush");
	}

}
