package com.techlabs.test;
import java.time.LocalDate;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        // Define a Supplier to generate random integers
        Supplier<Integer> supplier = () -> {
            Random random = new Random();
            return random.nextInt();
            
        };
        Supplier<LocalDate> dateSupplier = () -> LocalDate.now();

       
        System.out.println("Current Date: " + dateSupplier.get());

        
        System.out.println("Random Number Generated: " + supplier.get());
    }
}
