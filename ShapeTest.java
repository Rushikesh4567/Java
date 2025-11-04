package com.abs;

abstract class Shape{
	abstract void area();
	
}

class Circle extends Shape{
	double r;
	
	public Circle(double r)
	{
		this.r=r;
	}
	
	public void area()
	{
		System.out.println("The Area of Circle is: "+(3.142*r*r)+" Sq.cm");
	}
}

class Rectangle extends Shape{
	double l,b;
	
	public Rectangle(double l,double b)
	{
		this.l=l;
		this.b=b;
	}
	
	public void area()
	{
		System.out.println("The Area of Rectangle is: "+(l*b)+" sq.cm");
	}
}

public class ShapeTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Shape s = new Circle(5);
		s.area();
		
		Shape s1 = new Rectangle(5,6);
		s1.area();

	}

}
