package com.excep;

public class DivideByZero {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=10, b=0;
		try
		{
		  
		  double result = a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error: Divide by zero is not possible... ");
		}
		System.out.println("Program continues...");

	}

}
