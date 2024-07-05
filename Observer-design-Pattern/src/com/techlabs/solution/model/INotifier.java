package com.techlabs.solution.model;

public interface INotifier {
    void notifyUser(Account account) throws NotificationException;
}
