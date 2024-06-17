package com.techlabs.inherit;



public class Derived extends Base {
    public int x;

    public Derived(int x) {
        super(x);
        this.x = x;
    }

    @Override
    public void display() {
        System.out.println("Inside Derived: x=" + x);
        System.out.println("Base x= " + super.x);

        while (x > 0) {
            x--;
            super.display();
        }
    }
}

