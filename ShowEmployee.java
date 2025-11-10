package com.abs;

abstract class Employee{
	double sal;
	String name;
	
	public Employee(double sal, String name)
	{
		this.name=name;
		this.sal=sal;
	}
	abstract void CalculateBonus();
}

class Manager extends Employee{
	public Manager(double sal, String name)
	{
		super(sal,name);
	}
	
	public void CalculateBonus()
	{
		System.out.println("Name of Manager: "+ name + " ,Bonus Salary of Manager: "+(sal*0.5)+" Rupees");
	}
}

class Clerk extends Employee{
	public Clerk(double sal, String name)
	{
		super(sal,name);
	}
	
	public void CalculateBonus()
	{
		System.out.println("Name of Clerk: "+ name + " ,Bonus Salary of Clerk: "+(sal*0.1)+" Rupees");
	}
}
public class ShowEmployee {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Manager m = new Manager(50000,"John");
		Clerk c = new Clerk(15000,"Sean");
		
		m.CalculateBonus();
		c.CalculateBonus();
	}

}
