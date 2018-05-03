package org.gov.militaryexample;

public class MilitaryOfficer {

	
	void travel()
	{
		Government g = new Government();
		Vehicle v = g.giveVehicle();//upcasting
		v.start();
		if (v instanceof Truck)
		{
			Truck t = (Truck)v;//downcasting
			t.drive();
		}
		else if(v instanceof Aeroplane)
		{
			Aeroplane a = (Aeroplane)v;
			a.fly();
		}
		else if (v instanceof Ship)
		{
			Ship s = (Ship)v;
			s.sail();
		}
	}
	//v.stop();

}
