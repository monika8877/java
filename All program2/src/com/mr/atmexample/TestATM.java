package com.mr.atmexample;

public class TestATM {
	
public static void main(String[] args) {
		
		ATM a = new ATM();
		System.out.println("ATM is present");
		Card c = new Card();
		System.out.println("Card is inserted");
		Money paisa = a.withDraw(c, 1234);
		System.out.println("Recieved money by providing pin");
	}

}
