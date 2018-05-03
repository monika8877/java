package org.nokia.calcapp;

public class Calculator {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(4, 25);
		c.add(1, 2, 3);
		c.add(45.6, 72.4);
	}

	int add(int num1, int num2) {
		int res = num1 + num2;
		System.out.println(res);
		return res;
	}

	int add(int num1, int num2, int num3) {
		int res = num1 + num2 + num3;
		System.out.println(res);
		return res;
	}

	double add(double num1, double num2) {
		double res = num1 + num2;
		System.out.println(res);
		return res;
	}
}