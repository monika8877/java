package com.tupperware.fill;

public class TestBottle {

	public static void main(String[] args) {
		
		Bottle b = new Bottle();
		Water w = new Water();
		b.store(w);
		Oil o = new Oil();
	    Juice j = new Juice();
	    b.store(j);
	    b.store(o);
	    
	}
}
