package com.practice.method;

public class D3 {
	


	int a=10;
	int add(int a)
	{
		System.out.println("A");
		return 10;
	}
	double  add(int a)
	{
		this.a=a;
		System.out.println("B");
		return 10.0;
	}
	public static void main(String[] args)
	{
	
		D3 d=new D3();
		d.add(20);
		double a=d.add(20);
		System.out.println(a);
		
	}
}


