
public class Pattern {

	public static void main(String[] args) 
	{
		int r=5;
		
		int i,j,k;
		
		for (i=1;i<=r;i++)
		{
			for(j=i;j<=r;j++)
			{
				System.out.print(" ");
			}
			
			for(k=1;k<=(2*i-1);k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
