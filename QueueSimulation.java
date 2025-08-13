package com.collect;

import java.util.LinkedList;
import java.util.Scanner;

public class QueueSimulation {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		int choice;
		
		do
		{
			System.out.println("1. Add a Number.");
			System.out.println("2. Remove a Number.");
			System.out.println("3. Display all Numbers.");
			System.out.println("4. Exit.");
			
			System.out.println();
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				int n;
				System.out.println("Enter a number: ");
				n = sc.nextInt();
				queue.addLast(n);
				break;
			case 2:
				int removed;
				removed = queue.removeFirst();
				System.out.println("The removed number is: "+removed);
				break;
			case 3:
				System.out.println("Elements in queue are: "+queue);
				break;
			case 4:
				System.out.println("Exiting.... ");
				break;
			default:
				System.out.println("Invalid choice! Please enter valid choice.");
					
			}
			
		}while(choice!=4);
		
		sc.close();
	}

}
