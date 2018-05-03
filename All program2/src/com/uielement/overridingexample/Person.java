package com.uielement.overridingexample;

public class Person {
	
	void browse()
	{
		Browser b = new Browser();
		UIElement u = b.getElement("www.google.com");// tyhis line is showing upcasting behaveior because it is storing differnt value each time.
		System.out.println(u.type+" "+u.name);
		u.action();
		if(u instanceof Button){
		Button bu = (Button) u;
		bu.show();
		}
	}
	
	public static void main(String[] args) {
		Person p= new Person();
		p.browse();
		
	}

}
