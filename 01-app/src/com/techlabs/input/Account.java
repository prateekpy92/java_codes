package com.techlabs.input;

public class Account {

	
		 private int accNumber;
		 private String accName;
		 private int accBalance;
		 private AccountType accType;
		 public Account(int accNumber, String accName, int accBalance, AccountType accType) {
		  super();
		  this.accNumber = accNumber;
		  this.accName = accName;
		  this.accBalance = accBalance;
		  this.accType = accType;
		 }
		 public int getAccNumber() {
		  return accNumber;
		 }
		 public void setAccNumber(int accNumber) {
		  this.accNumber = accNumber;
		 }
		 public String getAccName() {
		  return accName;
		 }
		 public void setAccName(String accName) {
		  this.accName = accName;
		 }
		 public int getAccBalance() {
		  return accBalance;
		 }
		 public void setAccBalance(int accBalance) {
		  this.accBalance = accBalance;
		 }
		 public AccountType getAccType() {
		  return accType;
		 }
		 public void setAccType(AccountType accType) {
		  this.accType = accType;
		 }
		 public Account() {
		  super();
		 }
		 @Override
		 public String toString() {
		  return "AccNumber=" + accNumber + ", AccName=" + accName + ", AccBalance=" + accBalance
		    + ", AccType=" + accType + "";
		 }
		 
System.out.println("");
		}
