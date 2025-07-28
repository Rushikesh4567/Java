package com.array;


public class Duplicate 
{

	public static int removeDuplicates(int arr[])
	{
		int j=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[j]!=arr[i])
			{
				j++;
				arr[j]=arr[i];
			}
		}
		
		return j+1;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[] = {1,1,2,2,3,4};                   // Array should be sorted to remove duplicates
		
		System.out.println("Array elements are:\n");
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]+" ");
		}
		
		System.out.println();
		int m=removeDuplicates(arr);      
		
		System.out.println("\nAfter removing duplicates,Array elements are:\n");
		
		for(int i=0;i<m;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
