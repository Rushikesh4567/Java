import java.util.Scanner;
public class Program 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number = ");
		int n=scanner.nextInt();
		int i;
		boolean prime=true;
		
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				prime=false;
				break;
			}
			
		}
		
		if(prime)
		{
			System.out.println("It is a prime number.");
		}
		else
		{
			System.out.println("It is not a prime number.");
		}
		
	}

}
