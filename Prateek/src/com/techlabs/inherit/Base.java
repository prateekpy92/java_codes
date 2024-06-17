package com.techlabs.inherit;


public class Base {
    protected int x;

    public Base(int x) {
        this.x = x;
    }

    public void display() {
        System.out.println("Inside Base: x=" + x);
    }
}
