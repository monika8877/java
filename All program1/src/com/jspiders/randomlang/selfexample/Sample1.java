package com.jspiders.randomlang.selfexample;

public class Sample1 {

	
	void disp(float x)
	{
		System.out.println(x);
	}
	
	void disp(double d)
	
	{
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		
		Sample1 s = new Sample1();
		double d = 13.5875;
		s.disp(d);
		float x = 34;
		s.disp(x);
		
	}

}
