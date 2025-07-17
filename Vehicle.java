package com.practice;

public class Vehicle {

	private String make;
	private String model;
	private int year;
	private boolean isRunning=true;
	
	public Vehicle()
	{
		
	}
	
	public Vehicle(String make,String model,int year)
	{
		this.make=make;
		this.model=model;
		this.year=year;
	}
	
	public String getmake()
	{
		return make;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public int getYear()
	{
		return year;
	}

	public boolean isRunning()
	{
		return isRunning;
	}
	
	public void stopEngiene(boolean isRunning)
	{
		this.isRunning=isRunning;
	}
	
	public String startEngiene()
	{
		return "Vehicle engiene started...";
	}
	public String toString()
	{
		return "Vehicle: [ make: "+make+" model: "+model+" Year: "+year+" ]";
	}
}
