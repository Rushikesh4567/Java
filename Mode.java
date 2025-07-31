package com.array;
import java.util.Scanner;

public class Mode {

	public static int get_mode(int arr4[],int size)
	{

	    int count=0,mode=0;
	        for(int i=0; i<size; i++)
	        {
	              int icount=0;
	            for(int j=0;j<size;j++)
	            {
	                if(arr4[i]==arr4[j])
	                  {
	                    icount++;
	                  }
	                  
	                if(icount>count)
	                  {
	                    count=icount;
	                    mode=arr4[i];
	                  }
	            }
	        }
	        return mode;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.print("Enter the size of array: ");
		size=sc.nextInt();
		
		int arr4[] = new int[size];
		
		
		System.out.println("Enter Array elements: ");
		for(int b=0;b<size;b++)
		{
			arr4[b]=sc.nextInt();
			
		}

		
		System.out.println("Array elements are: ");
		for(int a:arr4)
		{
			System.out.print(a+" ");
		}
		
		System.out.println();
		
		int m=get_mode(arr4,size);
		
		System.out.println("Array with max appearance(mode) is "+m);
		
		sc.close();

	}

}
