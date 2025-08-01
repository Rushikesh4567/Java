package com.array;
import java.util.Scanner;

public class Shift_ele 
{
	public static void leftshift(int arr3[],int k)
	{
		int first=0;
		int n=arr3.length;
		k=k%n;
		
		for(int i=0;i<k;i++)
		{
			first=arr3[0];
			for(int j=0;j<n-1;j++)
			{
				arr3[j]=arr3[j+1];
			}
			
			arr3[n-1]=first;
		}
		
		for(int a:arr3)
		{
			System.out.print(a+" ");
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size,k=2;
		System.out.print("Enter the size of array: ");
		size=sc.nextInt();
		
		int arr3[] = new int[size];
		
		
		System.out.println("Enter Array elements: ");
		for(int b=0;b<size;b++)
		{
			arr3[b]=sc.nextInt();
			
		}
		
		System.out.println("\nArray elements before shifting:  ");
		for(int a:arr3)
		{
			System.out.print(a+" ");
		}
		
		System.out.println("\nArray elements After shifting kth position:  ");
		leftshift(arr3,k);
		
		sc.close();
	}

}
