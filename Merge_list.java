package com.collect;
import java.util.LinkedList;
import java.util.List;

public class Merge_list {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Integer> list1 = new LinkedList<Integer>();
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(80);
		list1.add(90);
		
		System.out.println("Elements in Lists 1 are  "+list1);
		System.out.println();
		
		List<Integer> list2 = new LinkedList<Integer>();
		
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(8);
		list2.add(9);
		
		System.out.println("Elements in Lists 2 are  "+list2);
		System.out.println();
		

		list1.addAll(list2);
		
		System.out.println();
		System.out.println("Elements in Lists 1 after merging are  "+list1);
		
	}

}
