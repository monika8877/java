package com.one97.paytmapp.login;


public class PhoneOppo {
	
	void unlock(String fingure) {  // we are using "String fingure" bcoz in method overloading method will be same but parameter should be changed ex---String fingure is the paramer
			
			System.out.println("unlock by fingerprint");
	}

	void unlock() {
		System.out.println("unlock by pattern");
	}
	
	public static void main(String[] args) {
		
		PhoneOppo p = new PhoneOppo();
		p.unlock("index");
		p.unlock();

	}

}


