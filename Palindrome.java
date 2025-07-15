package com.assignment;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) 
	{
	

		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		str=sc.nextLine();
		
		
//		int f=0,l;
//		l=str.length()-1;
//		boolean isPalindrome=true;
//		
//		while(f<l)
//		{
//			if(str.charAt(f)!=str.charAt(l))
//			{
//				isPalindrome=false;
//				break;
//			}
//			
//			f++;
//			l--;
//		}	
//		
//		if(isPalindrome)
//			{
//				System.out.println("String is palindrome");
//			}
//			else
//			{
//				System.out.println("String is not palindrome");
//			}
//		
		
		StringBuilder s=new StringBuilder(str);
		s.reverse();
		String b=s.toString();
		
		
			
	
		
		if(str.equals(b))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		sc.close();
		
	}
	
}



