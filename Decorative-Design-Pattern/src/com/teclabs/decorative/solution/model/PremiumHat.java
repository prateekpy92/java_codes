package com.teclabs.decorative.solution.model;

public class PremiumHat implements IHat {
    @Override
    public String getName() {
        return "Premium Hat";
    }

    @Override
    public String getDescription() {
        return "A premium hat with better quality.";
    }
}
