package com.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class List_sort {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(90);
		list.add(20);
		list.add(500);
		list.add(90);
		list.add(10);
		
		System.out.println("Elements in Lists are  "+list);
		System.out.println();
		
		Collections.sort(list);
		System.out.println("Sorted List is "+list);     // Ascending order
		
		Collections.sort(list , Collections.reverseOrder());
		
		System.out.println("Reversed List is "+list);     // Descending order
		
	}

}
