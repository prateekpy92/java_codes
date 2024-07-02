package com.teclabs.decorative.solution.model;

public class StandardHat implements IHat {
    @Override
    public String getName() {
        return "Standard Hat";
    }

    @Override
    public String getDescription() {
        return "A standard hat.";
    }
}