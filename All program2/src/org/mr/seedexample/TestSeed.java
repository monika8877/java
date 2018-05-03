package org.mr.seedexample;

public class TestSeed {
	// null, new coffeSeed, new mangoseed, new seed
	Seed s= new MangoSeed();
	s.grow();
	if(s instanceof coffeSeed)
	{
		CoffeSeed cs = (CoffeSeed) s;
		cs.prepareCoffee();
		
	}
	else if(s instanceof MangoSeed) {
		MangoSeed m = (MangoSeed) s;
		m.prepareJuice();
	}
	m.prepareJuice();

}
}
