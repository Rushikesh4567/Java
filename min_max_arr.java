package com.array;

import java.util.Scanner;

public class min_max_arr 
{
	public static int max(int arr2[],int size)
	{
		int max=arr2[0];
		for(int i=1;i<size;i++)
		{
			if(arr2[i]>max)
			{
				max=arr2[i];
			}
		}
		
		return max;
	}
	
	public static int min(int arr2[],int size)
	{
		int min=arr2[0];
		for(int i=1;i<size;i++)
		{
			if(arr2[i]<min)
			{
				min=arr2[i];
			}
		}
		
		return min;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.print("Enter the size of array: ");
		size=sc.nextInt();
		
		int arr2[] = new int[size];
		
		
		System.out.println("Enter Array elements: ");
		for(int b=0;b<size;b++)
		{
			arr2[b]=sc.nextInt();
			
		}

		System.out.println();
		System.out.println("Array elements are: ");
		
		for(int a:arr2)
		{
			System.out.print(a+" ");
		}
		
		int l=max(arr2,size);
		int s=min(arr2,size);
	
		System.out.println("\nMax value: "+ l + " Min value: "+ s);
		sc.close();
	}

}
