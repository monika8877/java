package com.practice.method;

public class D16 {
	
	int a=10;
	void add(int a,int d)
	{
		System.out.println(a/d);
		System.out.println("A");
		
	}
	void add(long d,long a)
	{
		//this.a=a;
		System.out.println(d/a);
		System.out.println("B");
		
	}
	public static void main(String[] args)
	{
		D16 d=new D16();
		d.add(10L,0);
	
	}

}
