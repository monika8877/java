package com.calculator.mul;

public class Mul {


	public static void main(String[] args) {
       
		Mul m = new Mul();
		m.mul(2, 3);
		m.add(3,5);
		m.sub(6,2);
	}
	
	void mul(int num1, int num2) {
		int res = num1 * num2;
		System.out.println(res);
	}
	
     void add(int i, int j) {
    	 int res = i + j;
    	 System.out.println(res);
		
	}
     
     void sub(int i, int j){
    	 int res = i - j;
    	 System.out.println(res);
     }
}
