package com.techlabs.interfce.model;

public class Robot implements IWorkable {
    @Override
    public void start() {
        System.out.println("Robot starting");
    }

    @Override
    public void stop() {
        System.out.println("Robot stopping");
    }
}


