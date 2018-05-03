package com.jspiders.randomlang.selfexample;

import java.util.Random;

public class Person {
	
	public static void main(String[] args) {
		Random r = new Random();    // ye line likhne se khud hi import ho jata h(import java.util.Random;)
	    boolean g = r.nextBoolean();
		
		//System.out.println("boolean");
		
		if(g == true)
		{
			System.out.println("Friend");
		}
		else if(g == false)
		{
			System.out.println("Enemy");
		}
	
	

}
}
