package com.techlabs.test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class NamesTest {

    public static void main(String[] args) {
        try {
            // Step 1: Read names from the provided text file
            List<String> names = Files.readAllLines(Paths.get("C:\\Users\\hp\\OneDrive\\Desktop\\names.txt"));

            // Step 2: Filter names that start with a specific letter 
            List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("P"))
                .collect(Collectors.toList());

            // Step 3: Convert all names to uppercase
            List<String> upperCaseNames = filteredNames.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

            // Step 4: Sort the names alphabetically
            List<String> sortedNames = upperCaseNames.stream()
                .sorted()
                .collect(Collectors.toList());

            // Step 5: Remove duplicate names
            List<String> uniqueNames = sortedNames.stream()
                .distinct()
                .collect(Collectors.toList());

            // Step 6: Collect the names into a new list
            List<String> finalNameList = uniqueNames;

            // Step 7: Count the number of names that do not contain 'i'
            long count = finalNameList.stream()
                .filter(name -> !name.contains("I"))
                .count();
            
            System.out.println("1 ->:names from the provided text file : " + names);
            System.out.println("2 ->:  start with a specific letter  : " + filteredNames);
            System.out.println("3 ->: all names to uppercase : " + upperCaseNames);
            System.out.println("4 ->: Sort the names alphabetically : " + sortedNames);
            System.out.println("5 ->: Remove duplicate names: " + uniqueNames);
            System.out.println("5 ->:Collect the names into a new list: " + finalNameList);
            System.out.println("Count of names without 'I': " + count);

            // Step 8: Concatenate all the names into a single string separated by commas
            String concatenatedNames = String.join(", ", finalNameList);
            System.out.println("Concatenated Names: " + concatenatedNames);

            // Step 9: Filter names that start with 'J', convert them to uppercase, sort them, and collect into a list
            List<String> jNames = names.stream()
                .filter(name -> name.startsWith("J"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

            System.out.println("Names starting with 'J': " + jNames);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

