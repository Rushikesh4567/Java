import java.util.Scanner;

public class Find_max {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 1st number = ");
		int a=scanner.nextInt();
		
		System.out.println("Enter 2nd number = ");
		int b=scanner.nextInt();
		
		System.out.println("Enter 3rd number = ");
		int c=scanner.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a + " is max number.");
			}
			else
			{
				System.out.println(c + " is max number.");
			}
		}
		
		else
		{
			if(b>c)
			{
				System.out.println(b + " is max number.");
			}
			else
			{
				System.out.println(c + " is max number.");
			}
		}
	}

}
