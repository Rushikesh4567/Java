package com.abs;

abstract class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void calculateInterest(); // must be defined by subclasses

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }

    void calculateInterest() {
        double interest = balance * 0.05;
        System.out.println("Interest: " + interest);
    }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(double balance) {
        super(balance);
    }

    void calculateInterest() {
        System.out.println("No interest for current account");
    }
}

public class BankTest {
    public static void main(String[] args) {
        BankAccount acc = new SavingsAccount(1000);
        acc.deposit(500);
        acc.calculateInterest();
        
        BankAccount acc1 = new CurrentAccount(2000);
        acc1.calculateInterest();
    }
}
