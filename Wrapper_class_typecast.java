import java.util.Scanner;

public class Wrapper_class_typecast {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer number= ");
		int a=sc.nextInt();
		
		System.out.println("Give number is "+a);
		
		Integer b=new Integer(a);
		
		String bi=Integer.toBinaryString(a);
		String o=Integer.toOctalString(a);
		String h= Integer.toHexString(a);
		
		System.out.println("Original int value: "+a);
        System.out.println("Boxed Integer object: "+b);
        System.out.println("Binary value: "+bi);
        System.out.println("Octal value : "+o);
        System.out.println("Hexadecimal Value : "+h);
	}

}
