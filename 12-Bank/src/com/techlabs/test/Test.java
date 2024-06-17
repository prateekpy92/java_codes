package com.techlabs.test;
import java.io.*;
import java.util.Scanner;

import com.techlabs.serial.CurrentAccount;
import com.techlabs.serial.SavingsAccount;

public class Test {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter details for Current Account:");
	        System.out.print("Account Number: ");
	        int caAccNo = scanner.nextInt();
	        scanner.nextLine();  
	        System.out.println("Name: ");
	        String caName = scanner.nextLine();
	        System.out.println("Initial Balance: ");
	        double caBalance = scanner.nextDouble();
	        System.out.println("Overdraft Limit: ");
	        double caOverdraftLimit = scanner.nextDouble();

	        CurrentAccount ca = new CurrentAccount(caAccNo, caName, caBalance, caOverdraftLimit);
	        System.out.println(ca.displayDetails());
	        ca.credit(200);
	        ca.debit(1000);
	        ca.debit(800); 
	       
	        System.out.println("Enter details for Savings Account:");
	        System.out.println("Account Number: ");
	        int saAccNo = scanner.nextInt();
	        scanner.nextLine(); 
	        System.out.println("Name: ");
	        String saName = scanner.nextLine();
	        System.out.println("Initial Balance: ");
	        double saBalance = scanner.nextDouble();
	        System.out.println("Minimum Balance: ");
	        double saMinBalance = scanner.nextDouble();

	        SavingsAccount sa = new SavingsAccount(saAccNo, saName, saBalance, saMinBalance);
	        System.out.println(sa.displayDetails());
	        sa.credit(300);
	        sa.debit(500);
	        sa.debit(900);  
	        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("account_data.ser"))) {
	            oos.writeObject(ca);
	            oos.writeObject(sa);
	            System.out.println("Accounts have been serialized.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	    
	        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("account_data.ser"))) {
	            CurrentAccount deserializedCa = (CurrentAccount) ois.readObject();
	            SavingsAccount deserializedSa = (SavingsAccount) ois.readObject();
	            System.out.println("Accounts have been deserialized.");
	            System.out.println(deserializedCa.displayDetails());
	            System.out.println(deserializedSa.displayDetails());
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }

	        scanner.close();
	    }
	}