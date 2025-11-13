package com.excep;

public class ArrayExample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try 
		{
			int arr[] = {1,2,3,4,5};
			System.out.println("Array element at index 10: "+arr[10]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error:Array element can't be accessed.. ");
		}
		
	}

}
