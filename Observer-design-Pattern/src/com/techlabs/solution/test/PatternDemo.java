package com.techlabs.solution.test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.techlabs.solution.model.Account;
import com.techlabs.solution.model.EmailNotifier;
import com.techlabs.solution.model.INotifier;
import com.techlabs.solution.model.SmsNotifier;

public class PatternDemo {

	   private static Set<Integer> registeredAccountNumbers = new HashSet<>();

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.print("Enter account number: ");
	            int accountNumber = scanner.nextInt();
	            scanner.nextLine();

	            if (registeredAccountNumbers.contains(accountNumber)) {
	                System.out.println("This account number is already registered. Please enter a unique account number.");
	                continue;
	            }

	            registeredAccountNumbers.add(accountNumber);

	            System.out.print("Enter account holder's name: ");
	            String name = scanner.nextLine();

	            System.out.print("Enter initial balance: ");
	            double balance = scanner.nextDouble();

	            Account account = new Account(accountNumber, name, balance);
	            INotifier emailNotifier = new EmailNotifier();
	            INotifier smsNotifier = new SmsNotifier();

	            System.out.print("Do you want to register email notifier (yes/no)? ");
	            scanner.nextLine(); // consume the newline
	            if (scanner.nextLine().equalsIgnoreCase("yes")) {
	                account.registerEmailNotifier(emailNotifier);
	            }

	            System.out.print("Do you want to register SMS notifier (yes/no)? ");
	            if (scanner.nextLine().equalsIgnoreCase("yes")) {
	                account.registerSmsNotifier(smsNotifier);
	            }

	            while (true) {
	                System.out.println("Choose an operation: 1) Deposit 2) Withdraw 3) Create New Account 4) Exit");
	                int choice = scanner.nextInt();

	                if (choice == 1) {
	                    System.out.print("Enter amount to deposit: ");
	                    double amount = scanner.nextDouble();
	                    account.deposit(amount);
	                } else if (choice == 2) {
	                    System.out.print("Enter amount to withdraw: ");
	                    double amount = scanner.nextDouble();
	                    account.withdraw(amount);
	                } else if (choice == 3) {
	                    break; 
	                } else if (choice == 4) {
	                    scanner.close();
	                    return; 
	                } else {
	                    System.out.println("Invalid choice. Try again.");
	                }
	            }
	        }
	    }
	}