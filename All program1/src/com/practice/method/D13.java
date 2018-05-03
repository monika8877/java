package com.practice.method;

public class D13 {
	
	

	int a=10;
	int add(int a,int d)
	{
		System.out.println("A");
		return 10;
	}
	String  add(long d,long a)
	{
		//this.a=a;
		System.out.println("B");
		return 'a';
		//return "Sni";
	}
	public static void main(String[] args)
	{
		D13 d=new D13();
		String a=d.add(10L,10);
		System.out.println(a);
		
	}

}
