package com.techlabs.interfce.model;
public class Loader implements IWorker {
    @Override
    public void start() {
        System.out.println("Loader starting");
    }

    @Override
    public void stop() {
        System.out.println("Loader stopping");
    }

    @Override
    public void eat() {
        System.out.println("Loader eating");
    }

    @Override
    public void rest() {
        System.out.println("Loader resting");
    }
}
