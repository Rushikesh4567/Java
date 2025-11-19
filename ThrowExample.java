package com.excep;

public class ThrowExample {

	static void checkpassword(String str)
	{
		if(str.length()<6)
		{
			throw new IllegalArgumentException("Error: Password must be greater than 6");
		}
		else
		{
			System.out.println("Password Accepted...");
		}
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
			checkpassword("12345");
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
