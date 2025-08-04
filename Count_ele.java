package com.collect;

import java.util.List;
import java.util.ArrayList;

public class Count_ele {

	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>();
		int count=0;
		
		list.add("Java");
		list.add("Python");
		list.add("Java");
		list.add("Cpp");
		list.add("C");
		list.add("Java");
		
		String find = "Java";
		for(String a : list) 
		{
			if(a.equals(find))
			{
				count++;
			}
		}
		
		System.out.println("The Word "+find+" appears "+count+" times in the list.");
		
	}

}
