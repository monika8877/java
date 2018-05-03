package com.uielement.overridingexample;

public class CheckBox extends UIElement {

	public CheckBox() {
		super("checkbox", "checkname");
	}
	
	@Override
	void action()
	{
		System.out.println("check to activate");
	}
	
	

}
