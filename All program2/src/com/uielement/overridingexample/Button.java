package com.uielement.overridingexample;

public class Button extends UIElement {

	public Button() {
		super("button", "submit");
	}
	
	void action()
	{
		System.out.println("Click to activate");
	}
	
	void show()
	{
		System.out.println("Display button");
	}
	

}
