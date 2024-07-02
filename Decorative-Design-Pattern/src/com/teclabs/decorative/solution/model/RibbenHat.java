package com.teclabs.decorative.solution.model;

public class RibbenHat extends HatDecorator {
    public RibbenHat(IHat hat) {
        super(hat);
    }

    @Override
    public String getDescription() {
        return hat.getDescription() + ", decorated with a ribbon.";
    }
}
