package com.assignment;

public class Duplicate_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1[]= {"Apple","Mango","Orange"};
		String s2[]= {"Mango","Banana","Apple"};
		
		for(int i=0;i<s1.length;i++)
		{
			for(int j=0;j<s2.length;j++)
			{
				if(s1[i].equals(s2[j]))
				{
					System.out.println("The Duplicate String is: "+ s1[i]);
				}
			}
		}
	}

}
