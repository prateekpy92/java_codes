package com.techlabs.violation;

public class TaxCalculatorTest {
    public static void main(String[] args) {
        ILogger logger = new DBLogger();
        
        TaxCalculator t1 = new TaxCalculator(logger);
        t1.calculateTax(100, 10);
        
        TaxCalculator t2 = new TaxCalculator(logger);
        t2.calculateTax(2000, 0);
    }
}

