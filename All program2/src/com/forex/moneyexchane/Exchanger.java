package com.forex.moneyexchane;

public class Exchanger {
	double covertUsdToInr(double dollar)
	{
		double inr = dollar * 64.91 * 0.98;
		return inr;
	}
	
	public static void main(String[] args) {
		Exchanger ex = new Exchanger();
		double inr =ex.covertUsdToInr(10);
		System.out.println((int)inr);
	}

}
