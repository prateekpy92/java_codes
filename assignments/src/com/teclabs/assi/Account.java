package com.teclabs.assi;

import java.util.Scanner;

public class Account {

    private int accno;
    private String name;
    private double balance;
    private double OVER_DRAFT_LIMIT;
    private double MIN_BALANCE;

    // Constructor
    public Account(int accno, String name, double balance, double overdraftLimit, double minBalance) {
        this.accno = accno;
        this.name = name;
        this.balance = balance;
        this.OVER_DRAFT_LIMIT = overdraftLimit;
        this.MIN_BALANCE = minBalance;
    }

    // Credit method
    public void credit(double amount) {
        balance += amount;
    }

    // Debit method
    public void debit(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // Debit method with overdraft limit for Current Account
    public void debitWithOverdraft(double amount) {
        if (balance + OVER_DRAFT_LIMIT >= amount) {
            balance -= amount;
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }

    // Debit method with minimum balance for Savings Account
    public void debitWithMinBalance(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal would go below minimum balance.");
        }
    }

    // Getters and setters
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create account objects
        Account currentAccount = new Account(123, "John", 5000, 1000, 0);
        Account savingsAccount = new Account(456, "Jane", 3000, 0, 500);

        // User input for current account
        System.out.println("Enter amount to debit from current account: ");
        double currentAmount = scanner.nextDouble();
        currentAccount.debitWithOverdraft(currentAmount);

        // User input for savings account
        System.out.println("Enter amount to debit from savings account: ");
        double savingsAmount = scanner.nextDouble();
        savingsAccount.debitWithMinBalance(savingsAmount);

        // Display balances
        System.out.println("Current Account Balance: " + currentAccount.getBalance());
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

        scanner.close();
    }
}
