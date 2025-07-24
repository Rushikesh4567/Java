package com.work;

interface Printable
{
	void print();
}

interface Scanable
{
	void scan();
}

class Printer implements Printable,Scanable{
	public void print()
	{
		System.out.println("Print function is called...");
	}
	
	public void scan()
	{
		System.out.println("Scan function is called...");
	}
}
public class MultiFunctionalPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printable p=new Printer();
		Scanable s=new Printer();
		
		p.print();
		s.scan();
	}

}
