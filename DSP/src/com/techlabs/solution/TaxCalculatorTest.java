package com.techlabs.solution;

public class TaxCalculatorTest {
    public static void main(String[] args) {
        TaxCalculator t1 = new TaxCalculator(new DBLogger());
        t1.calculateTax(10000, 0);

        t1.setLogger(new FileLogger());
        t1.calculateTax(1000, 10);
    }
}
