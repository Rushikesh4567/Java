package com.array;
import java.util.Scanner;

public class Arraysum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int size,sum=0;
		System.out.print("Enter the size of array: ");
		size=sc.nextInt();
		
		int arr[] = new int[size];
		
		
		System.out.println("Enter Array elements: ");
		for(int b=0;b<size;b++)
		{
			arr[b]=sc.nextInt();
			
		}
		
		System.out.println("Array elements before its addiion: ");
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		
		for(int a:arr)
		{
			sum+=a;
		}
		
		System.out.println("\nSum of array elements is: "+sum);
		
		sc.close();
	}


}
