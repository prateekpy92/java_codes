package com.techlabs.facade.solution.model;

public class HatAdapter implements IItems {
    private Hat hat;

    public HatAdapter(Hat hat) {
        this.hat = hat;
    }

    @Override
    public String getItemName() {
        return hat.getShortName();
    }

    @Override
    public double getItemPrice() {
        return hat.getTotalPrice();
    }
}


