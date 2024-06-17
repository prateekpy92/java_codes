package com.techlabs.model;

public class NoSuchMovieFoundException extends Exception {
    public NoSuchMovieFoundException(String message) {
        super(message);
    }
}