package com.practice.method;

public class D4 {
	

		int a=10;
		int add(int a,double d)
		{
			System.out.println("A");
			return 10;
		}
		double  add(double d,int a)
		{
			this.a=a;
			System.out.println("B");
			return 10.0;
		}
		public static void main(String[] args)
		{
			D4 d=new D4();
			d.add(20,20);
			double a=d.add(20.0,20);
			System.out.println(a);
			
		}
		
	}


