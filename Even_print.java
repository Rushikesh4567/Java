package com.collect;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Even_print
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
		
		System.out.println("Even elements array are:");
		
		for(int j : list)
		{
			if(j%2==0)
			{
				System.out.print(j+" ");
			}
		}
		
		sc.close();
		
	}

}
