package com.techlabs.model;


public class CurrentAccount extends Account {
    private static final long serialVersionUID = 1L;
    
    private double OVER_DRAFT_LIMIT;

    public CurrentAccount(int accno, String name, double balance, double overdraftLimit) {
        super(accno, name, balance);
        this.OVER_DRAFT_LIMIT = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return OVER_DRAFT_LIMIT;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.OVER_DRAFT_LIMIT = overdraftLimit;
    }

    @Override
    public void debit(double amount) {
        if (balance - amount >= -OVER_DRAFT_LIMIT) {
            super.debit(amount);
        } else {
            System.out.println("Debit amount exceeds overdraft limit.");
        }
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Overdraft Limit: " + OVER_DRAFT_LIMIT);
    }
}
