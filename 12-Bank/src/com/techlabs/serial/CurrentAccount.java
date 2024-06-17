package com.techlabs.serial;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int accno, String name, double balance, double overdraftLimit) {
        super(accno, name, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void debit(double amount) {
        if (getBalance() - amount >= -overdraftLimit) {
            setBalance(getBalance() - amount);
            System.out.println("Debited " + amount + ". New balance is " + getBalance());
        } else {
            System.out.println("Overdraft limit exceeded. Cannot debit " + amount + ". Current balance is " + getBalance() + ", Overdraft limit is " + overdraftLimit);
        }
    }

    @Override
    public String displayDetails() {
        return "Current Account - " + super.displayDetails() + ", Overdraft Limit: " + overdraftLimit;
    }
}
