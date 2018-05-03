package com.practice.method;

public class D2 {
	
	
	int a=10;
	void add(int a, int b)
	{
		System.out.println("this.a");
	}
	void add(int a)
	{
		this.a=a;
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		D2 d=new D2();
		d.add(20,20);
		d.add(20);
		
	}

}
