package com.excep;
import java.io.FileReader;
import java.io.FileNotFoundException;


public class FinallyExample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("Notexist.txt");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error: File not found exception..");
		}
		finally 
		{
			System.out.println("Program Finished..");
		}
	}

}
