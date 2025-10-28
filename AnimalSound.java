package com.abs;

abstract class Animal{
	abstract void sound();
}

class Dog extends Animal
{
	public void sound()
	{
		System.out.println("Woof Woof!");
	}
}

class Cat extends Animal
{
	public void sound()
	{
		System.out.println("Meow..");
	}
}

class Cow extends Animal
{
	public void sound()
	{
		System.out.println("Hmmmmm...");
	}
}
public class AnimalSound 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		Animal a3 = new Cow();
		
		a1.sound();
		a2.sound();
		a3.sound();
	}

}
