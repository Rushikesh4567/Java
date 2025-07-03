
public class Pattern_building {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i,j,r=5;
		
		for(i=1;i<=r;i++)
		{
			/*for(j=1;j<=i;j++)
			{
				System.out.print("* ");      // right angled triangle
			}*/
			
			
			
			/*for(j=5;j>=i;j--)
			{									// inverted right angled triangle
				System.out.print("* ");
			}*/
			
			
			for(j=1;j<=r-i;j++)
			{
				System.out.print(" ");
			}
			
			for(j=1;j<=i;j++)					// pyramid and left angled triangle
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
