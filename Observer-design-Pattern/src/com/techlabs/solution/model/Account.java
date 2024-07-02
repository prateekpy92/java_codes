package com.techlabs.solution.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int accountNumber;
    private String name;
    private double balance;
    private INotifier emailNotifier;
    private INotifier smsNotifier;

    public Account(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            notifyAllNotifiers();
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        notifyAllNotifiers();
    }

    public void registerEmailNotifier(INotifier notifier) {
        if (this.emailNotifier == null) {
            this.emailNotifier = notifier;
        } else {
            System.out.println("Email notifier already registered for this account.");
        }
    }

    public void registerSmsNotifier(INotifier notifier) {
        if (this.smsNotifier == null) {
            this.smsNotifier = notifier;
        } else {
            System.out.println("SMS notifier already registered for this account.");
        }
    }

    private void notifyAllNotifiers() {
        if (emailNotifier != null) {
            emailNotifier.notifyUser(this);
        }
        if (smsNotifier != null) {
            smsNotifier.notifyUser(this);
        }
    }

    // Getters and setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}
