package com.techlabs.test;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsSort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jayesh", "Nimesh", "Mark", "Mahesh", "Ramesh");
        
      
        List<String> firstThreeSorted = names.stream()
                                             .limit(3)
                                             .sorted()
                                             .collect(Collectors.toList());
        System.out.println("First 3 students sorted in ascending order: " + firstThreeSorted);
        
        List<String> filteredSorted = names.stream()
                                           .limit(3)
                                           .filter(name -> name.toLowerCase().contains("a"))
                                           .sorted()
                                           .collect(Collectors.toList());
        System.out.println("First 3 students sorted in ascending order if it contains 'a': " + filteredSorted);
     
        List<String> namesDescending = names.stream()
                                            .sorted((a, b) -> b.compareTo(a))
                                            .collect(Collectors.toList());
        System.out.println("Students in descending order: " + namesDescending);
        
        List<String> firstThreeChars = names.stream()
                                            .map(name -> name.length() > 3 ? name.substring(0, 3) : name)
                                            .collect(Collectors.toList());
        System.out.println("First 3 characters of all names: " + firstThreeChars);
        
        List<String> shortNames = names.stream()
                                       .filter(name -> name.length() <= 4)
                                       .collect(Collectors.toList());
        System.out.println("Names of the students that contain less than or equal to 4 characters: " + shortNames);
    }
}
