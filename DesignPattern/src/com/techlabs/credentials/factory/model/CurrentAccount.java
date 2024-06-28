package com.techlabs.credentials.factory.model;

public class CurrentAccount implements IAccount {
 private String accno;
 private double overdraft;
 private double balance;

 public CurrentAccount(String accno, double overdraft) {
     this.accno = accno;
     this.overdraft = overdraft;
     this.balance = 0;
 }

 @Override
 public void credit(double amount) {
     this.balance += amount;
     System.out.println("Credited " + amount + " to Current Account " + this.accno + ". New balance is " + this.balance + ".");
 }

 @Override
 public void debit(double amount) {
     if (amount <= this.balance + this.overdraft) {
         this.balance -= amount;
         System.out.println("Debited " + amount + " from Current Account " + this.accno + ". New balance is " + this.balance + ".");
     } else {
         System.out.println("Exceeded overdraft limit.");
     }
 }
}
