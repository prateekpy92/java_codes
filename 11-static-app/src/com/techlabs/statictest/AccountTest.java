package com.techlabs.statictest;

import com.techlabs.model.AccountDemo;

public class AccountTest {

	public static void main(String[] args) {
		  AccountDemo account1 = new AccountDemo(123, "John Doe", 1000);
	        AccountDemo account2 = new AccountDemo(124, "John", 10);
	        System.out.println("Number of accounts created: " + AccountDemo.getAccountCreate());

	        System.out.println("Number of accounts created: " + AccountDemo.getAccountCount());
	}

}