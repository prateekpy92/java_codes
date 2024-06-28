package com.techlabs.credentials.factory.test;
import java.util.Scanner;

import com.techlabs.credentials.factory.model.AccountFactory;
import com.techlabs.credentials.factory.model.IAccount;

	
	
public class AccountTest {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter account type (SavingsAccount/CurrentAccount): ");
	        String accountType = scanner.nextLine();

	        IAccount account;
	        if ("SavingsAccount".equalsIgnoreCase(accountType)) {
	            System.out.println("Enter account number: ");
	            String accno = scanner.nextLine();
	            System.out.println("Enter name: ");
	            String name = scanner.nextLine();
	            System.out.println("Enter initial balance: ");
	            double balance = scanner.nextDouble();
	            account = AccountFactory.createAccount("SavingsAccount", accno, name, balance);
	        } else if ("CurrentAccount".equalsIgnoreCase(accountType)) {
	            System.out.println("Enter account number: ");
	            String accno = scanner.nextLine();
	            System.out.println("Enter overdraft limit: ");
	            double overdraft = scanner.nextDouble();
	            account = AccountFactory.createAccount("CurrentAccount", accno, overdraft);
	        } else {
	            System.out.println("Invalid account type.");
	            scanner.close();
	            return;
	        }

	        while (true) {
	            System.out.println("Choose an action (credit/debit/exit): ");
	            String action = scanner.next();
	            if ("credit".equalsIgnoreCase(action)) {
	                System.out.println("Enter amount to credit: ");
	                double amount = scanner.nextDouble();
	                account.credit(amount);
	            } else if ("debit".equalsIgnoreCase(action)) {
	                System.out.println("Enter amount to debit: ");
	                double amount = scanner.nextDouble();
	                account.debit(amount);
	            } else if ("exit".equalsIgnoreCase(action)) {
	                break;
	            } else {
	                System.out.println("Invalid action.");
	            }
	        }

	        scanner.close();
	    }
	}


