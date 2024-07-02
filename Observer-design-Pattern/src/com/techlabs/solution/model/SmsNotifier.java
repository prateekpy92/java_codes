package com.techlabs.solution.model;

public class SmsNotifier implements INotifier {
    @Override
    public void notifyUser(Account account) {
        System.out.println("SMS Notification: Account holder " + account.getName() +
                ", Account " + account.getAccountNumber() + " balance is " + account.getBalance());
    }
}