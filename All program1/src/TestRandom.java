import java.util.Random;
import java.util.Scanner;

import Hindi.Hindi;


public class TestRandom {
	int num;
	
	public static void main(String[] args) {
		
		
		
		Random r = new Random();
		int num = r.nextInt(5)+1;
		System.out.println(num);
		
		if(num ==2){
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

