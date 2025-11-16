package com.excep;

import java.util.Scanner;
import java.util.InputMismatchException;

public class MultipleCatch {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		try
		{
			System.out.println("Enter 1st number: ");
			int a= s.nextInt();
			
			System.out.println("Enter 2nd number: ");
			int b= s.nextInt();
			
			double result = a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error: Number can't be divisible by Zero.. ");
			
		}
		catch(InputMismatchException e)
		{
			System.out.println("Error: Please enter valid number..");
		}
		
		
		
	}

}
