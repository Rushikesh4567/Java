package com.practice;

public class Truck extends Vehicle{

	public Truck(String make,String model,int year)
	{
		super(make,model,year);
	}

	@Override
	public String startEngiene()
	{
		return "Truck Engiene Started";
	}
}
