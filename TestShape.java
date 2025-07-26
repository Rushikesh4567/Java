package com.work;

interface Shape
{
	void draw();
}

class Rectangle implements Shape{
	public void draw()
	{
		System.out.println("Rectrangle shape...");
	}
}
class Square implements Shape{
	public void draw()
	{
		System.out.println("Square shape...");
	}
}
class NewCircle implements Shape
{
	public void draw()
	{
		System.out.println("Circle shape...");
	}
}
public class TestShape {

	public static void main(String[] args) 
	{
		Shape s[]=new Shape[3];
		
		s[0]=new Rectangle();
		s[1]=new NewCircle();
		s[2]=new Square();

		for(Shape s1: s)
		{
			s1.draw();
		}
	}

}
