package com.practice.method;

public class D1 {
	
	

		int a=10;
		void add(int a, int a)
		{
			System.out.println(a+a);
			
			
		}
		void add(int a)
		{
			this.a=a;
			System.out.println(a);
		}
		public static void main(String[] args)
		{
			D1 d=new D1();
			d.add(20,20);
			d.add(20);
			
		}
		
	}


