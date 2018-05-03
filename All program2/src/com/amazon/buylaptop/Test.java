package com.amazon.buylaptop;

import java.util.Scanner;

public class Test {
	
	


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = s.next();
		s.nextLine();// this is dummy next line we have taken beacuse if we  will not take this then if we press inter 
		            // then "enter key will go and sit with next if u have have any confusion just run this program
		System.out.println("Enter the address");
		String address = s.nextLine();
		System.out.println("Enter your Comapany name");
		String companyName = s.nextLine();
		System.out.println("Enter your age");
		int age = s.nextInt();
		System.out.println("Enter your salary");
		double salary = s.nextDouble();
		System.out.println(name + " " + age +" " + salary);
	    
		
	}

}
