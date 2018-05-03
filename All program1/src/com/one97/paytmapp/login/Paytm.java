package com.one97.paytmapp.login;

public class Paytm {

	void login(String emailid, String pwd) {
		System.out.println("login with email");
	}

	void login(long phone, int pwd) {
		System.out.println("login with phone no");
	}

	public static void main(String[] args) {
		Paytm p = new Paytm();
		p.login(1345678909, 56456456);
		p.login("fsdfsdf", "dhfskfd");
	}
}
