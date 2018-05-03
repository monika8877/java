package com.reynold.writing;

public class Animal {
	
        String colour;
        Double price;
        String breed;
        
        
        void bark()
        {
        	System.out.println("Dog barks");
        }
        
        
        void eat()
        {
        	System.out.println("Dog eats");
        }
        
        
        void showDetails()
        {
        	System.out.println(this.colour + " " + this.price +" " +this.breed);
        }
        
        
        public static void main(String[] args) {
			Animal a = new Animal();
			a.breed = "urban";
			a.price = 56.743;
			a.colour = "Black";
			a.bark();
			a.eat();
			a.showDetails();
			
			
			
//			System.out.println(a.breed);
//			System.out.println(a.price);
//			System.out.println(a.colour);
			
			
			
			
			
        	
		}

	

}












