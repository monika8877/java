package com.practice.method;

public class Demo8 {
	
	   void disp(int a, double b){
			System.out.println("A");
		   }
		   void disp(int a, double b, double c){
			System.out.println("B");
		   }
		   void disp(int a, float b){
			System.out.println("C");
		   }
		   public static void main(String args[]){
			Demo8 obj = new Demo8();
			obj.disp(100, 20.67f);
		  
		   }
}
