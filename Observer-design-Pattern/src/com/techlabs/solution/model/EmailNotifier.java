package com.techlabs.solution.model;

public class EmailNotifier implements INotifier {
    @Override
    public void notifyUser(Account account) {
        System.out.println("Email Notification: Account holder " + account.getName() +
                ", Account " + account.getAccountNumber() + " balance is " + account.getBalance());
    }
}
