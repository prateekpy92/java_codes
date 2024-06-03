package com.techlabs.model;
import java.io.Serializable;

public class Account implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int accno;
    private String name;
    protected double balance;

    public Account(int accno, String name, double balance) {
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void credit(double amount) {
        balance += amount;
    }

    public void debit(double amount) {
        balance -= amount;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accno);
        System.out.println("Account Holder Name: " + name);
        System.out.println("Balance: " + balance);
    }
}
