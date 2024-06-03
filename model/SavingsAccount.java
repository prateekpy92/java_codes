package com.techlabs.model;


public class SavingsAccount extends Account {
    private static final long serialVersionUID = 1L;
    
    private double MIN_BALANCE;

    public SavingsAccount(int accno, String name, double balance, double minBalance) {
        super(accno, name, balance);
        this.MIN_BALANCE = minBalance;
    }

    public double getMinBalance() {
        return MIN_BALANCE;
    }

    public void setMinBalance(double minBalance) {
        this.MIN_BALANCE = minBalance;
    }

    @Override
    public void debit(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            super.debit(amount);
        } else {
            System.out.println("Debit amount violates minimum balance requirement.");
        }
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Minimum Balance: " + MIN_BALANCE);
    }
}
