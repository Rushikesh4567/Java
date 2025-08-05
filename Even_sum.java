package com.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Even_sum
{

	public static int sumList(List<Integer> items)
	{
		int sum=0;
		for(int j : items)
		{
			if(j%2==0)
			{
				sum += j;
			}
		}
		
		return sum;
	}
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		List<Integer> list= new ArrayList<Integer>();
		
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		System.out.println();
		
		System.out.println("Enter "+size+" elements: \n");
		for(int i = 0; i < size ;i++)
		{
			list.add(sc.nextInt());
		}
		
		int k=sumList(list);
		System.out.println("The sum of even elememts in list is : "+k);
		sc.close();
		
	}

}
