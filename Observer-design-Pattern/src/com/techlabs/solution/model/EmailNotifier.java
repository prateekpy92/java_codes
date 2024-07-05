package com.techlabs.solution.model;

public class EmailNotifier implements INotifier {
    @Override
    public void notifyUser(Account account) throws EmailNotificationException {
        // Simulate sending an email
        boolean success = sendEmail(account);
        if (!success) {
            throw new EmailNotificationException("Failed to send email notification to " + account.getName());
        }
        System.out.println("Email notification sent to " + account.getName() + " for account " + account.getAccountNumber() + ". Current balance: " + account.getBalance());
    }

    private boolean sendEmail(Account account) {
        // Simulate email sending logic
        return true; // Change to false to simulate a failure
    }
}

