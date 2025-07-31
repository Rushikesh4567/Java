package com.array;
import java.util.Scanner;

public class Reverse_arr {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.print("Enter the size of array: ");
		size=sc.nextInt();
		
		int arr1[] = new int[size];
		
		
		System.out.println("Enter Array elements: ");
		for(int b=0;b<size;b++)
		{
			arr1[b]=sc.nextInt();
			
		}

		
		System.out.println("Array elements are: ");
		
		for(int a:arr1)
		{
			System.out.print(a+" ");
		}
		
		System.out.println("\nReverse elements are: ");
		
		for(int b=size-1;b>=0;b--)
		{
			System.out.print(arr1[b]+" ");
		}
		
		sc.close();
	}

}
