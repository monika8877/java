package com.uielement.overridingexample;

public class TextBox extends UIElement {

	public TextBox() {
		super("Textbox", "name");
	}
	
	
	@Override
	void action()
	{
		System.out.println("Enter text to activate");
	}
	
	

}
