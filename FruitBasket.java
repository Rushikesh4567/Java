package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0, choice;

        System.out.print("Enter Basket size: ");
        int size = sc.nextInt();
        sc.nextLine(); // consume newline

        Fruits[] basket = new Fruits[size];

        do {
            System.out.println("\nMenu:");
            System.out.println("0. Exit");
            System.out.println("1. Add Mango");
            System.out.println("2. Add Orange");
            System.out.println("3. Add Apple");
            System.out.println("4. Display names of all fruits");
            System.out.println("5. Display details of all fresh fruits");
            System.out.println("6. Mark a fruit as stale");
            System.out.println("7. Display tastes of all stale fruits");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 0:
                    System.out.println("Exiting...");
                    break;

                case 1:
                    if (counter < basket.length) {
                        System.out.print("Enter Fruit Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Fruit Color: ");
                        String color = sc.nextLine();
                        System.out.print("Enter Weight: ");
                        double weight = sc.nextDouble();
                        sc.nextLine();
                        basket[counter++] = new Mango(name, color, weight);
                    } else {
                        System.out.println("Basket is full.");
                    }
                    break;

                case 2:
                    if (counter < basket.length) {
                        System.out.print("Enter Fruit Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Fruit Color: ");
                        String color = sc.nextLine();
                        System.out.print("Enter Weight: ");
                        double weight = sc.nextDouble();
                        sc.nextLine();
                        basket[counter++] = new Orange(name, color, weight);
                    } else {
                        System.out.println("Basket is full.");
                    }
                    break;

                case 3:
                    if (counter < basket.length) {
                        System.out.print("Enter Fruit Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Fruit Color: ");
                        String color = sc.nextLine();
                        System.out.print("Enter Weight: ");
                        double weight = sc.nextDouble();
                        sc.nextLine();
                        basket[counter++] = new Apple(name, color, weight);
                    } else {
                        System.out.println("Basket is full.");
                    }
                    break;

                case 4:
                    System.out.println("Fruits in Basket:");
                    for (Fruits f : basket) {
                        if (f != null) {
                            System.out.println(f.getName());
                        }
                    }
                    break;

                case 5:
                    System.out.println("Fresh Fruits:");
                    for (Fruits f : basket) {
                        if (f != null && f.isFresh()) {
                            System.out.println(f);
                            System.out.println("Taste: " + f.taste());
                        }
                    }
                    break;

                case 6:
                    System.out.print("Enter index to mark fruit as stale: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < counter) {
                        basket[index].setFresh(false);
                        System.out.println("Marked as stale.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 7:
                    System.out.println("Stale Fruits Taste:");
                    for (Fruits f : basket) {
                        if (f != null && !f.isFresh()) {
                            System.out.println(f.getName() + ": " + f.taste());
                        }
                    }
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }
}
