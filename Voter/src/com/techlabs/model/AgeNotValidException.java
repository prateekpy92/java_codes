package com.techlabs.model;

public class AgeNotValidException extends Exception {
    
    public AgeNotValidException(String message) {
        super(message);
    }
}