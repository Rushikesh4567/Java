import java.util.Scanner;

public class Average {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st Double Integer = ");
		
		if(!sc.hasNextDouble())
		{
			System.out.println("Error! Invalid number.  ");
		}
		
		double a=sc.nextDouble();
		
		
		System.out.println("Enter 2nd Double Integer = ");
		
		if(!sc.hasNextDouble())
		{
			System.out.println("Error! Invalid number.  ");
		}
		double b=sc.nextDouble();
		
		double avg=(a+b)/2.0;
		
		
		System.out.println("Average of two numbers is  "+avg);
		
		
	}

}
