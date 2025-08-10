package com.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class Odd_print
{

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
		
		
		int num;
		Iterator<Integer> trav = list.iterator();
		
		while(trav.hasNext())
		{
			num = trav.next();
			
			if(num%2!=0)
			{
				trav.remove();
			}
		}
		
		System.out.println("After removing Odd elements, the array is: "+list);
		sc.close();
		
	}

}
