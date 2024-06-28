package com.techlabs.credentials.factory.model;

public class AccountFactory {
 public static IAccount createAccount(String accountType, Object... args) {
     if ("SavingsAccount".equalsIgnoreCase(accountType)) {
         return new SavingsAccount((String) args[0], (String) args[1], (double) args[2]);
     } else if ("CurrentAccount".equalsIgnoreCase(accountType)) {
         return new CurrentAccount((String) args[0], (double) args[1]);
     } else {
         throw new IllegalArgumentException("Invalid account type");
     }
 }
}

