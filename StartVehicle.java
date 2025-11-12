package com.abs;

abstract class Vehicle{
	abstract void start();
	void stop()
	{
		System.out.println("The Vehicle is stopped...");
	}
}

class Car extends Vehicle{
	public void start()
	{
		System.out.println("The Car is started...");
	}
	
	public void stop() 
	{
		System.out.println("The Car is stopped...");
	}
}

class Bike extends Vehicle{
	public void start()
	{
		System.out.println("\nThe Bike is started...");
	}
	
	public void stop() 
	{
		System.out.println("The Bike is stopped...");
	}
	
}

public class StartVehicle {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Vehicle v1 = new Car();
		v1.start();
		v1.stop();
		
		Vehicle v2 = new Bike();
		v2.start();
		v2.stop();
		
	}

}
