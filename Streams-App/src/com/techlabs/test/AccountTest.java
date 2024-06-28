package com.techlabs.test;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.techlabs.model.Account;
public class AccountTest {
	


	    public static void main(String[] args) {
	        List<Account> accounts = Arrays.asList(
	                new Account(1, "Jayesh", 1000.0),
	                new Account(2, "Nimesh", 2000.0),
	                new Account(3, "Mark", 500.0),
	                new Account(4, "Mahesh", 1500.0),
	                new Account(5, "Ramesha", 3000.0)
	        );

	        // a. Show Account details of account with minimum Balance
	        Optional<Account> minBalanceAccount = accounts.stream()
	                                                      .min(Comparator.comparingDouble(Account::getBalance));
	        minBalanceAccount.ifPresent(account -> System.out.println("Account with minimum balance: " + account));

	        // b. Show Account details of account with maximum Balance
	        Optional<Account> maxBalanceAccount = accounts.stream()
	                                                      .max(Comparator.comparingDouble(Account::getBalance));
	        maxBalanceAccount.ifPresent(account -> System.out.println("Account with maximum balance: " + account));

	        // c. Show names greater than 6 characters
	        List<String> longNames = accounts.stream()
	                                         .map(Account::getName)
	                                         .filter(name -> name.length() > 6)
	                                         .collect(Collectors.toList());
	        System.out.println("Names greater than 6 characters: " + longNames);

	        // d. Find total of balance of all accounts
	        double totalBalance = accounts.stream()
	                                      .mapToDouble(Account::getBalance)
	                                      .sum();
	        System.out.println("Total balance of all accounts: " + totalBalance);
	    }
	}


