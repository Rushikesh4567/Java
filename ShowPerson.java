package com.abs;

abstract class Person
{
	String name;
	int age;
	
	public Person(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	
	abstract void displayMessege();
}

class Student extends Person
{
	public Student(String name, int age)
	{
		super(name,age);
	}
	
	public void displayMessege()
	{
		System.out.println("Name of Student : "+ name + ", Age of Student: "+age);
	}
}

public class ShowPerson 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Student s = new Student("Rushikesh",22);
		s.displayMessege();
	}

}
