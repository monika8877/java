package com.macdonald.sell;

public class Burger {
	
		int price;
	    String type;
	    boolean isCheesy;
	    String brand= "Macdonald";
	    
	    Burger(String type)
	    {
	    	this(150,type, true, "Macdonald");
	    }
	    
	    Burger(String type, boolean isCheesy)
	    {
	    	this(500, type, isCheesy, "Macdonald");
	    }
	    
	    Burger(int price, String type, boolean isCheesy)
	    {
	    	this(price,type, isCheesy, "Macdonald");
	    }

		public Burger(int price, String type, boolean isCheesy, String brand) {
			this.price = price;
			this.type = type;
			this.isCheesy = isCheesy;
			this.brand = brand;
			this.disp();
		}
		
		void disp()
		{
			System.out.println(this.price+ " "+ this.brand+ " "+ this.type+ " "+ this.isCheesy);
		}
		public static void main(String[] args) {
			
			Burger b = new Burger("veg");
			
			Burger b1 = new Burger("nonveg", true);
			
			Burger b2 = new Burger(450, "veg", true);
			

			
		}
	    
	    
	    

	}

