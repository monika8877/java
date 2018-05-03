package com.practice.method;

public class D6 {
	
	int a=10;
	int add(int a,double d)
	{
		System.out.println("A");
		return 10;
	}
	int  add(double d,int a)
	{
		this.a=a;
		System.out.println("B");
		return 11;
	}
	public static void main(String[] args)
	{
		D6 d=new D6();
		double a=d.add(20.0,20);
		System.out.println(a);
		
	}
	
}


