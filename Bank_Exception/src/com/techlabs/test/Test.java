package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.BankAccount;
import com.techlabs.model.InsufficientFundsException;
import com.techlabs.model.NegativeAmountException;
public class Test {

	 public static void main(String[] args) {
	        BankAccount account = new BankAccount();
	        Scanner scanner = new Scanner(System.in);
	        boolean continueBanking = true;

	        while (continueBanking) {
	            System.out.println("\nBanking Menu:");
	            System.out.println("1. Deposit");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Check Balance");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option: ");

	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter amount to deposit: ");
	                    double depositAmount = scanner.nextDouble();
	                    try {
	                        account.deposit(depositAmount);
	                        System.out.println("Deposited $" + depositAmount);
	                    } catch (NegativeAmountException e) {
	                        System.out.println("Error: " + e.getMessage());
	                    }
	                    break;

	                case 2:
	                    System.out.print("Enter amount to withdraw: ");
	                    double withdrawAmount = scanner.nextDouble();
	                    try {
	                        account.withdraw(withdrawAmount);
	                        System.out.println("Withdrew $" + withdrawAmount);
	                    } catch (InsufficientFundsException e) {
	                        System.out.println("Error: " + e.getMessage());
	                    } catch (NegativeAmountException e) {
	                        System.out.println("Error: " + e.getMessage());
	                    }
	                    break;

	                case 3:
	                    System.out.println("Current Balance: $" + account.getBalance());
	                    break;

	                case 4:
	                    continueBanking = false;
	                    System.out.println("Exiting the banking application.");
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please choose a valid option.");
	                    break;
	            }
	        }

	        scanner.close();
	    }
	}