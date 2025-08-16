package com.collect;

import java.util.List;
import java.util.ArrayList;

public class Replace_ele
{

	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>();
		
		list.add("Apple");
		list.add("Mango");
		list.add("Banana");
		list.add("Orange");
		
		

		System.out.println("Original List is "+list);
	
		String ele = "Replaced";
		list.set(3, ele);
		
		System.out.println("After Replacing the element in List is "+list);
		
	}

}