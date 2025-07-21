package com.work;

interface Arith
{
	int add();
	default int subtract(int x,int y)
	{
		return x-y;
	}
}

class Addition implements Arith{
	private int a,b;
	
	public Addition(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	public int add()
	{
		return a+b;
	}
}

public class TestArithmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arith a = new Addition(10,5);
		System.out.println("The addition is : "+a.add());
		System.out.println("The Subtraction is : "+a.subtract(10,5));
	}

}
