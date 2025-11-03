package com.abs;

abstract class Calculator
{
	int a,b;
	public Calculator(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	abstract void add();
	abstract void sub();
}

class SimpleCalculator extends Calculator
{
	public SimpleCalculator(int a,int b) 
	{
		super(a,b);
	}
	
	public void add()
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	public void sub()
	{
		System.out.println("Subtraction is: "+(a-b));
	}
}



public class CalculatorTest
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SimpleCalculator s = new SimpleCalculator(55,6);
		s.add();
		s.sub();
	}

}
