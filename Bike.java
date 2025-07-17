package com.practice;

public class Bike extends Vehicle{

	public Bike(String make,String model,int year)
	{
		super(make,model,year);
	}

	@Override
	public String startEngiene()
	{
		return "Bike Engiene Started";
	}
}
