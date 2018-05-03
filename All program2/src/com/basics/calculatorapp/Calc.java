package com.basics.calculatorapp;

public class Calc {

	public static void main(String[] args) {
		Calc c = new Calc();
        c.add(15, 20);//35
        c.add(40, 15);//55
        c.sub(10,5); 
        c.mul(2,3);
        }

	void add(int num1, int num2) {
		int res = num1 + num2;
		System.out.println(res);
	}
	
	void mul(int i, int j) {
        int res = i * j;
        System.out.println(res);
	}

	void sub(int i, int j) {
        int	res = i - j;
        System.out.println(res);
		
	}
	
	
}