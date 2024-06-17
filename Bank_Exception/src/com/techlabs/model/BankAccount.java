package com.techlabs.model;
	import com.techlabs.model.InsufficientFundsException;
	import com.techlabs.model.NegativeAmountException;

	public class BankAccount {
	    private double balance;

	    public BankAccount() {
	        this.balance = 0;
	    }

	    public void deposit(double amount) throws NegativeAmountException {
	        if (amount < 0) {
	            throw new NegativeAmountException("Cannot deposit a negative amount.");
	        }
	        balance += amount;
	    }

	    public void withdraw(double amount) throws InsufficientFundsException, NegativeAmountException {
	        if (amount < 0) {
	            throw new NegativeAmountException("Cannot withdraw a negative amount.");
	        }
	        if (amount > balance) {
	            throw new InsufficientFundsException("Insufficient funds for this withdrawal.");
	        }
	        balance -= amount;
	    }

	    public double getBalance() {
	        return balance;
	    }
	}


