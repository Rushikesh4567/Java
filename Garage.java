package com.practice;
import java.util.Scanner;

public class Garage
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter size of vehicle array: ");
		size=sc.nextInt();
		
		Vehicle[] garage = new Vehicle[size];
		
		int choice,count=0;
		
		do 
		{
			System.out.println();
			System.out.println("1. Add Car ");
			System.out.println("2. Add Bike ");
			System.out.println("3. Add Truck. ");
			System.out.println("4. Show all Vehicles.");
			System.out.println("5. Start all Engienes. ");
			System.out.println("6. Stop a vehicle.");
			System.out.println("7. Show details of all stopped vehicle. ");
			System.out.println("8. Exit.");
			System.out.println();
			
			System.out.println("Enter your choice ");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter car manufactured company: ");
				String make=sc.next();
				
				System.out.println("Enter car model: ");
				String model=sc.next();
				
				System.out.print("Enter car manufactured year: ");
				int year=sc.nextInt();
				System.out.println();
				
				if(count<size)
				{
					garage[count++]=new Car(make,model,year);
				}
				else
				{
					System.out.println("Array is full.");
				}
				
				break;
				
			case 2:
				System.out.println("Enter Bike manufactured company: ");
				 make=sc.next();
				
				System.out.println("Enter Bike model: ");
				model=sc.next();
				
				System.out.println("Enter Bike manufactured year: ");
				year=sc.nextInt();
				System.out.println();
				
				if(count<size)
				{
					garage[count++]=new Bike(make,model,year);
				}
				else
				{
					System.out.println("Array is full.");
				}
				
				break;
				
			case 3:
				System.out.println("Enter Truck manufactured company: ");
				 make=sc.next();
				
				System.out.println("Enter Truck model: ");
				model=sc.next();
				
				System.out.println("Enter Truck manufactured year: ");
				year=sc.nextInt();
				System.out.println();
				
				if(count<size)
				{
					garage[count++]=new Truck(make,model,year);
				}
				else
				{
					System.out.println("Array is full.");
				}
				
				break;
				
			case 4:
				for(Vehicle v: garage)
				{
					if(v!=null)
					{
						System.out.println(v.toString());
					}
				}
				break;
				
			case 5:
				for(Vehicle v: garage)
				{
					if(v!=null&&v.isRunning())
					{
						System.out.println(v.startEngiene());
					}
				}
				break;
				
			case 6:
				int idx;
				System.out.println("Enter idx to stop vehicle: ");
				idx=sc.nextInt();
				if(idx>=0&&idx<size)
				{
					garage[idx].stopEngiene(false);
				}
				else
				{
					System.out.println("Invalid index..");
				}
				break;
			case 7:
				for(Vehicle v: garage)
				{
					if(v!=null&&!v.isRunning())
					{
						System.out.println(v.toString());
					}
					System.out.println("vehicle is stopped..");
				}
				break;
			case 8:
				System.out.println("Exit..");
				break;
			
			default:
				System.out.println("Invalid choice..");
			}
			
		}while(choice!=8);
		sc.close();
	}

}
