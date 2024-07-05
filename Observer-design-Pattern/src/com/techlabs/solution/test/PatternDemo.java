package com.techlabs.solution.test;



import com.techlabs.solution.model.Account;
import com.techlabs.solution.model.EmailNotifier;
import com.techlabs.solution.model.INotifier;
import com.techlabs.solution.model.SmsNotifier;

public class PatternDemo {

	 Account account = new Account("12345", "John Doe", 1000.0);
     account registerNotifire(new EmailNotifire());
     account registerNotifier(new SmsNotifier());

     account.deposit(500.0);
     account.withdraw(200.0);
     account.withdraw(1500.0); 
 }
}