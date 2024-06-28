package com.techlabs.model;

public class Caller implements Runnable {
    public String message;
    public callme target;
    public Thread thread;

    public Caller(String message, callme target) {
        super();
        this.message = message;
        this.target = target;
        this.thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
    	synchronized(target) {
    		target.call(message);
    		}
        target.call(message);
    }
}
