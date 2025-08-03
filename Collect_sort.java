package com.collect;
import java.util.LinkedList;
import java.util.List;

public class Collect_sort {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Integer> list = new LinkedList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(80);
		list.add(90);
		
		System.out.println("Elements in Lists are  "+list);
		System.out.println();
		
		LinkedList<Integer> reversed = new LinkedList<Integer>();
		
		for(int i = list.size()-1; i >= 0 ; i--)
		{
			reversed.add(list.get(i));
		}
		

		System.out.println("Reversed list without using Collections.reverse() is: "+reversed);
	}

}
