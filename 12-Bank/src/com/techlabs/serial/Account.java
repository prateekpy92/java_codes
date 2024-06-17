package com.techlabs.serial;

import java.io.Serializable;

public class Account implements Serializable {
    private int accno;
    private String name;
    private double balance;

    public Account(int accno, String name, double balance) {
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }

    public void credit(double amount) {
        this.balance += amount;
        System.out.println("Credited " + amount + ". New balance is " + this.balance);
    }

    public void debit(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Debited " + amount + ". New balance is " + this.balance);
        } else {
            System.out.println("Insufficient balance to debit " + amount + ". Current balance is " + this.balance);
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String displayDetails() {
        return "Account Number: " + accno + ", Name: " + name + ", Balance: " + balance;
    }
}
