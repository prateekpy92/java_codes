package com.techlabs.facade.solution.model;

public class Hat {
    private String shortName;
    private String longName;
    private double basicPrice;
    private double tax;

    public Hat(String shortName, String longName, double basicPrice, double tax) {
        this.shortName = shortName;
        this.longName = longName;
        this.basicPrice = basicPrice;
        this.tax = tax;
    }

    public String getShortName() {
        return shortName;
    }

    public String getLongName() {
        return longName;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public double getTax() {
        return tax;
    }

    public double getTotalPrice() {
        return basicPrice + tax;
    }
}
