package com.teclabs.decorative.solution.model;

public class GoldenHat extends HatDecorator {
    public GoldenHat(IHat hat) {
        super(hat);
    }

    @Override
    public String getDescription() {
        return hat.getDescription() + ", decorated with gold.";
    }
}

