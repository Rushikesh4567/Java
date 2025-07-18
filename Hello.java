package com.work;

interface Greetings
{
	void sayhello();
}

class EnglishGreetings implements Greetings{
	
	public void sayhello() 
	{
		System.out.println("Hello.");
	}
}

class HindiGreetings implements Greetings{
	public void sayhello()
	{
		System.out.println("Namaste..");
	}
}
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greetings g1=new EnglishGreetings();
		Greetings g2=new HindiGreetings();
		
		g1.sayhello();
		g2.sayhello();
	}

}
