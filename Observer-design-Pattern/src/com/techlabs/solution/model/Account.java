package com.techlabs.solution.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private String accountNumber;
    private String name;
    private double balance;
    private List<INotifier> notifiers;

    public Account(String accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.notifiers = new ArrayList<>();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            notifyAllNotifiers();
        }
    }

    public void deposit(double amount) {
        balance += amount;
        notifyAllNotifiers();
    }

    public void registerNotifier(INotifier notifier) {
        notifiers.add(notifier);
    }

    private void notifyAllNotifiers() {
        for (INotifier notifier : notifiers) {
            try {
                notifier.notifyUser(this);
            } catch (NotificationException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}