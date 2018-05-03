package com.practice.method;

public class D10 {
	
	int a=10;
	int add(int a,double d)
	{
		System.out.println("A");
		return 10;
	}
	int  add(double d,long a)
	{
		
		System.out.println("B");
		return 10;
	}
	public static void main(String[] args)
	{
		D10 d=new D10();
		double a=d.add(20.0,12345678902);
		System.out.println(a);
		
	}


}
