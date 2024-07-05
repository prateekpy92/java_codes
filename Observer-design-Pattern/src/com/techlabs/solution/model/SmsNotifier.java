package com.techlabs.solution.model;

public class SmsNotifier implements INotifier {
    @Override
    public void notifyUser(Account account) throws SmsNotificationException {
        // Simulate sending an SMS
        boolean success = sendSms(account);
        if (!success) {
            throw new SmsNotificationException("Failed to send SMS notification to " + account.getName());
        }
        System.out.println("SMS notification sent to " + account.getName() + " for account " + account.getAccountNumber() + ". Current balance: " + account.getBalance());
    }

    private boolean sendSms(Account account) {
        // Simulate SMS sending logic
        return true; // Change to false to simulate a failure
    }
}