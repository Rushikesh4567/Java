package com.collect;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Remove_duplicates
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
		
		Set<Integer> unique = new LinkedHashSet<Integer>(list);
		System.out.println("after removing duplicates, the unique elements are "+unique);
		
		sc.close();
		
	}

}
