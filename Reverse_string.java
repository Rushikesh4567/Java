package com.assignment;
import java.util.Scanner;

public class Reverse_string {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		str=sc.nextLine();
		
		StringBuilder b=new StringBuilder(str);
		
		System.out.println("The reverse string: "+b.reverse());
		
		sc.close();
	}

}
