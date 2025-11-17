package com.excep;

public class NullExample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str = null;
		
		try {
			System.out.println("String length is: "+str.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("Error: Null String is not accesible..");
		}

	}

}
