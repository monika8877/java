package com.practice.method;

public class D7 {
	
	void disp(int a, double b){
		System.out.println("A");
	   }
	   void disp(int a, double b, double c){
		System.out.println("B");
	   }
	   public static void main(String args[]){
		D7 obj = new D7();
		
		obj.disp(100, 20.67f);
	   }

}
