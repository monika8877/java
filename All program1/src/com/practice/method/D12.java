package com.practice.method;

public class D12 {
	
	int a=10;
	int add(int a,int d)
	{
		System.out.println("A");
		return 10;
	}
	int  add(long d,long a)
	{
		//this.a=a;
		System.out.println("B");
		return 10;
	}
	public static void main(String[] args)
	{
		D12 d=new D12();
		double a=d.add(10L,10);
		System.out.println(a);
		
	}
	
}


