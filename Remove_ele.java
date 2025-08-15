package com.collect;

import java.util.List;
import java.util.ArrayList;

public class Remove_ele
{

	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>();
		
		list.add("Apple");
		list.add("Mango");
		list.add("Banana");
		list.add("Orange");
		
		

		System.out.println("Original List is "+list);
	
		list.remove("Banana");
		
		System.out.println("After removing the  List is "+list);
		
	}

}