package com.collect;

import java.util.List;
import java.util.ArrayList;

public class Check_if_exists {

	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("Python");
		list.add("Java");
		list.add("Cpp");
		list.add("C");
		list.add("Java");
		
		String find = "Java";

		if(list.contains(find))
		{
			System.out.println("The word java exists.");
		}
		else
		{
			System.out.println("The word java does not exists.");
		}
		
	}

}