package com.work;

import java.util.Scanner;

interface ShapeArea
{
 double PI = 3.142;  

 double calculateArea();  
}

class Circle implements ShapeArea
{
	 private double radius;
	
	 public Circle(double radius) 
	{
	     this.radius = radius;
	}

	 public double calculateArea() 
	 {
	     return PI * radius * radius;
	 }
}


public class CalcArea 
{
 public static void main(String[] args) 
 {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter radius of the circle: ");
     double r = sc.nextDouble();

     Circle circle = new Circle(r);

     System.out.println("Area of Circle: " + circle.calculateArea());
     
     sc.close();
 }
 

}
