package com.techlabs.test;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 25, 35, 40, 55);

        // Print all numbers incremented by 5
        System.out.println("All numbers:");
        numbers.stream()
               .forEach(x -> System.out.println(x + 5));

        // Print all odd numbers
        System.out.println("All Odd numbers:");
        numbers.stream()
               .filter(x -> x % 2 != 0)
               .forEach(x -> System.out.println(x));

        // Create a list of even numbers
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(x -> x % 2 == 0)
                                           .collect(Collectors.toList());

        int addition = numbers.stream()
            .reduce(0, (sum, x) -> sum + x);
        System.out.println("Sum of elements of list: " + addition);

        System.out.println("After Multiplying with 5:");
        List<Integer> multiplyers = numbers.stream()
            .map(x -> x * 5)
            .collect(Collectors.toList());
        multiplyers.forEach(x -> System.out.println(x));

System.out.println("Sorted:");
numbers.stream().sorted().limit(3)
    .forEach(x -> System.out.println(x));
List<Integer> sortedNumbers = null;
List<Integer> lastThreeSorted = sortedNumbers
.subList(Math.max(sortedNumbers
		.size() - 3, 0), sortedNumbers.size());


    }
}

