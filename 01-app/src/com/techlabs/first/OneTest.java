package com.techlabs.first;
import java.util.Scanner;

import com.techlabs.input.Account;
import com.techlabs.input.AccountType;
import com.techlabs.inputs.AccountOne;
public class OneTest {


	 public static void main(String[] args) {
	  Account account[]=new Account[2];
	  Scanner scanner=new Scanner(System.in);
	  for(int i=0;i<account.length;i++) {
	   account[i]=new Account();
	   System.out.println("Enter Account Number");
	   account[i].setAccNumber(scanner.nextInt());
	   
	   System.out.println("Enter Holder Name");
	   account[i].setAccName(scanner.next());
	   System.out.println("Enter Account Balance");
	   account[i].setAccBalance(scanner.nextInt());
	   System.out.println("Account Type Press 1 For Svaing:Press 2 for Current");
	   int accType=scanner.nextInt()
	;   if(accType==1) {
	 account[i].setAccType(AccountType.Svaing);
	}
	if(accType==2) {
	 account[i].setAccType(AccountType.Current);
	}
	  }
	  for(int i=0;i<account.length;i++) {
	   System.out.println(account[i]);
	  }

	 }

	}