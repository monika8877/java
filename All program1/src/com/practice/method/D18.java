package com.practice.method;

public class D18 {

		void add(int[] a)
		{
			System.out.println("A");
		}
		void add(int a)
		{
			System.out.println("B");
		}
		public static void main(String[] args)
		{
			System.out.println("a");
			D18  d= new D18();
			d.add(10);
			
		
		}
	}


