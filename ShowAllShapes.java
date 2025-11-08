package com.abs;

abstract class AllShapes{
	abstract void draw();
	void display()
	{
		System.out.println("This is Abstract class AllShapes...");
	}
	
}

class Circles extends AllShapes{
	public void draw()
	{
		System.out.println("\nThe Circle shape is drawn...");
	}
	
	public void display()
	{
		System.out.println("This is Circle Shape..");
	}
}

class Triangle extends AllShapes{
	public void draw()
	{
		System.out.println("\nThe Triangle Shape is drawn...");
	}
	
	public void display()
	{
		System.out.println("This is Triangle Shape..");
	}
}


class Square extends AllShapes{
	public void draw()
	{
		System.out.println("\nThe Square Shape is drawn...");
	}
	
	public void display()
	{
		System.out.println("This is Square Shape..");
	}
}
public class ShowAllShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllShapes s[] = {new Circles(),new Triangle(),new Square()};
		
		for(AllShapes a: s)
		{
			a.draw();
			a.display();
		}
	}

}
