package com.practice.method;

public class Demo9 {
	
	int a=10;
	int add(int a,double d)
	{
		System.out.println("A");
		return 10;
	}
	int  add(double d,int a)
	{
		
		System.out.println("B");
		return 10;
	}
	public static void main(String[] args)
	{
		Demo9 d=new Demo9();
		double a=d.add(20.0,12345678902);
		System.out.println(a);
		
	}

}
