package com.techlabs.solution;

public class FileLogger implements ILogger {
    @Override
    public void log(String err) {
        System.out.println("Logged to file: " + err);
    }
}
