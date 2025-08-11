package com.collect;

import java.util.List;
import java.util.ArrayList;

public class Print_list {

	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("Python");
		list.add("Java");
		list.add("Cpp");
		list.add("C");
		list.add("Java");
		
		for(String a : list) 
		{
			System.out.println(a+" ");
		}
		
	}

}
