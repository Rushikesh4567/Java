package com.collect;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Min_max_list {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> list= new ArrayList<Integer>();
		
		int size=5,max=0,min=0;
		
		System.out.println("Enter "+size+" elements: \n");
		for(int i = 0; i < size ;i++)
		{
			list.add(sc.nextInt());
		}
		
		max = list.get(0);
		min = list.get(0);
		
		for(int a=0;a<list.size()-1;a++)
		{
			 if(list.get(a)>max)
			 {
				 max = list.get(a);
			 }
			 
			 if(list.get(a)<min)
			 {
				 min = list.get(a);
			 }
			 
		}
		
		System.out.println("\nThe minimum element is: "+min+" and maximum element is: "+max);
		
		sc.close();
		
	}

}
