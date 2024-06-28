package com.techlabs.credentials.factory.model;

public class SavingsAccount implements IAccount {
 private String accno;
 private String name;
 private double balance;

 public SavingsAccount(String accno, String name, double balance) {
     this.accno = accno;
     this.name = name;
     this.balance = balance;
 }

 @Override
 public void credit(double amount) {
     this.balance += amount;
     System.out.println("Credited " + amount + " to Savings Account " + this.accno + ". New balance is " + this.balance + ".");
 }

 @Override
 public void debit(double amount) {
     if (amount <= this.balance) {
         this.balance -= amount;
         System.out.println("Debited " + amount + " from Savings Account " + this.accno + ". New balance is " + this.balance + ".");
     } else {
         System.out.println("Insufficient balance.");
     }
 }
}
