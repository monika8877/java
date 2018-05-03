package com.jspiders.randomlang.selfexample;

public class Sample {
	
	void show(double x)
	{
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		
		Sample s = new Sample();
		s.show('A');
//		byte b = 5;  // it will search for byte method first then it data type (method name is int here) so it will search for "int" method then it will give o/p
		s.show(5);
		s.show(123);
	}

}
