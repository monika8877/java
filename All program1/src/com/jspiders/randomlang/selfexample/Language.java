package com.jspiders.randomlang.selfexample;

import java.util.Random;

public class Language {	
	
	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(6)+1;
		
		
//		System.out.println(num);
		
		if(num ==1){
			System.out.println("English");		
		}
		else if(num==2){
			System.out.println("Hindi");
		}
		else if(num==3){
			System.out.println("Spanish");
		}
		else if(num==4){
			System.out.println("German");
		}
		else if(num==5){
			System.out.println("French");
		}
	}
}


