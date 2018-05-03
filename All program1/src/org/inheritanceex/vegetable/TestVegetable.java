package org.inheritanceex.vegetable;

public class TestVegetable {
	public static void main(String[] args) {
     Potato p = new Potato();
     p.clean();
     p.prepareChips();
     System.out.println(p.color + " "+p.type);
     
     Capsicum c = new Capsicum();
     c.clean();
     c.preparePizza();
     System.out.println(c.color+ " "+c.type);
	}
}
