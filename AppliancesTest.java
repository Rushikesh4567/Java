package com.abs;

abstract class Appliances{
	abstract void turnOn();
	
	void plugIn()
	{
		System.out.println("The appliances are Plugged in.");
	}
}

class Fan extends Appliances{
	public void turnOn()
	{
		System.out.println("The Fan is turned on...");
	}
	
	public void plugIn()
	{
		System.out.println("The fan is Plugged in.");
	}
}

class WashingMachine extends Appliances{
	public void turnOn()
	{
		System.out.println("The WashingMachine is turned on...");
	}
	
	public void plugIn()
	{
		System.out.println("The WashingMachine is Plugged in.");
	}
}

public class AppliancesTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WashingMachine w = new WashingMachine();
		w.turnOn();
		w.plugIn();
		
		Fan f = new Fan();
		f.turnOn();
		f.plugIn();
	}

}
