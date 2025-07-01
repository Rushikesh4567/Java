import java.util.Scanner;
public class Fibonacci 
{
	public static void main(String[] args)
	{
		int i;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of terms = ");
		int n=scanner.nextInt();
		
		int first=0,second=1,next;
		
		for(i=0;i<n;i++)
		{
			if(i<=1)
			{
				next=i;
			}
			else
			{
				next=first+second;
				first=second;
				second=next;
			}
			
			System.out.print(next+" ");
		}
	}
}
