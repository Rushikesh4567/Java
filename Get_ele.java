package com.collect;

import java.util.List;
import java.util.ArrayList;

public class Get_ele {

	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>();
		
		list.add("Apple");
		list.add("Mango");
		list.add("Banana");
		list.add("Orange");
		
		
		System.out.println("Getting element at index 2 is "+list.get(2));
		
	}

}