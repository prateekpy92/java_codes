package com.techlabs.serial;




public class SavingsAccount extends Account {
    private double minBalance;

    public SavingsAccount(int accno, String name, double balance, double minBalance) {
        super(accno, name, balance);
        this.minBalance = minBalance;
    }

    @Override
    public void debit(double amount) {
        if (getBalance() - amount >= minBalance) {
            setBalance(getBalance() - amount);
            System.out.println("Debited " + amount + ". New balance is " + getBalance());
        } else {
            System.out.println("Minimum balance requirement not met. Cannot debit " + amount + ". Current balance is " + getBalance() + ", Minimum balance is " + minBalance);
        }
    }

    @Override
    public String displayDetails() {
        return "Savings Account - " + super.displayDetails() + ", Minimum Balance: " + minBalance;
    }
}
