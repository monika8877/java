package com.practice.method;

public class D19 {
	void add()
		{
			System.out.println("A");
			//this.add();
		}
		void add(int a,int b)
		{
			System.out.println("B");
		}

		public static void main(String[] args)
		{
			D19 d =new D19();
			d.add();
		}
	}


