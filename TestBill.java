package com.work;

interface Billable{
	double calculateBill();
}

class WaterBill implements Billable{
	private double litres;
	
	public WaterBill(double litres)
	{
		this.litres=litres;
	}
	
	public double calculateBill()
	{
		return litres*0.5;
	}
}

class ElectricBill implements Billable{
	private double units;
	
	public ElectricBill(double units)
	{
		this.units=units;
	}
	
	public double calculateBill()
	{
		return units*6.5;
	}
}

class GasBill implements Billable{
	private int cylinders;
	
	public GasBill(int cylinders)
	{
		this.cylinders=cylinders;
	}
	
	public double calculateBill()
	{
		return cylinders*950;
	}
}
public class TestBill 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Billable t1=new WaterBill(10.0);
		Billable t2=new ElectricBill(5.5);
		Billable t3=new GasBill(2);
		
		System.out.println("The water bill is : "+t1.calculateBill()+" Rupees");
		System.out.println("The Electric bill is : "+t2.calculateBill()+" Rupees");
		System.out.println("The Gas bill is : "+t3.calculateBill()+" Rupees");
		System.out.println();
		double total;
		total = t1.calculateBill()+t2.calculateBill()+t3.calculateBill();
		
		System.out.println("The total bill is : "+total);
	}

}
