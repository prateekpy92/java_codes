package com.techlabs.test;
import java.util.function.Function;
import com.techlabs.model.FactModel;
public class Factorial {
    public static void main(String[] args) {
     
        int number = 5;
        int number1 = 10;
  

FactModel<Integer ,Integer> factorialConsumer = n ->  {
    if (n < 0) {
        System.out.println("Factorial is not defined for negative numbers.");
        return;
    }

    int result = 1;
    for (int i = 1; i <= n; i++) {
        result *= i;
    }

   
    System.out.println("Factorial of " + n + " is: " + result);
};


factorialConsumer.accept(number,number1);
}
}

    

