package com.techlabs.model;

public class AccountDemo {

	    private static int accountCount = 0; 
	    private int accountNumber;
	    private String name;
	    private double balance;

	    public AccountDemo(int accountNumber, String name, double balance) {
	    	 this.accountNumber = accountNumber;
		        this.name = name;
		        this.balance = balance;
		        accountCount++;  
		}

	    public static int getAccountCreate() {
	        return AccountCreate();
	    }

	    private static int AccountCreate() {
			
			return 0;
		}

		public static int getAccountCount() {
	        return accountCount;
	    }

	  
	    public String getName() {
	        return name;
	    }

	    public double getBalance() {
	        return balance;
	    }
	
}