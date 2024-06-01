package com.teclabs.assi;

import java.util.Scanner;

public class squareArray {

    public int[] sortedSquares(int[] A) {
        int n = A.length;
        int[] res = new int[n];
        int index = n - 1;
        int l = 0, r = n - 1;

        // Manually calculate the absolute values and compare them
        while (l <= r) {
            int leftAbs = (A[l] < 0) ? -A[l] : A[l]; // equivalent to Math.abs(A[l])
            int rightAbs = (A[r] < 0) ? -A[r] : A[r]; // equivalent to Math.abs(A[r])

            if (leftAbs < rightAbs) {
                res[index] = A[r] * A[r];
                r--;
            } else {
                res[index] = A[l] * A[l];
                l++;
            }
            index--;
        }
        return res;
    }

    // Helper method to print array (for testing purposes)
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = -1;
        // Read the number of elements with validation
        while (n <= 0) {
            System.out.print("Enter the number of elements in the array (positive integer): ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n <= 0) {
                    System.out.println("Please enter a positive integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter a positive integer.");
                scanner.next(); // clear invalid input
            }
        }

        // Read the elements of the array
        int[] input = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // clear invalid input
            }
            input[i] = scanner.nextInt();
        }

        // Create an instance of ArraySequence and call the sortedSquares method
        ArraySequence arraySequence = new ArraySequence();
        int[] output = arraySequence.sortedSquares(input);

        // Print the result
        System.out.print("The sorted squares of the array are: ");
        printArray(output);
        
        // Close the scanner
        scanner.close();
    }
}
