package com.array;
import java.util.Scanner;

public class sorted_arr 
{

	public static boolean sort(int[] arr2,int size)
	{
		for(int i=0;i<size-1;i++)
		{
			if(arr2[i]>arr2[i+1])
			{
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
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
		
		boolean val=sort(arr2,size);
		
		System.out.println();
		if(val==true)
		{
			System.out.println("Array elements are sorted");
		}
		else
		{
			System.out.println("Array elements are not sorted");
		}
		
		sc.close();
	}

}
