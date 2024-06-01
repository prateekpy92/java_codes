package com.teclabs.assi;

import java.util.Scanner;
import java.util.Random;

public class pig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int totalScore = 0;
        int turnScore = 0;
        int turnNumber = 0;
        boolean continueTurn = true;

        while (totalScore < 20) {
            if (continueTurn) {
                System.out.println("TURN " + (turnNumber + 1));
                continueTurn = false;
            }

            int die = rollDie(random);
            System.out.println("You rolled: " + die);

            if (die == 1) {
                System.out.println("Turn over. No score.");
                turnScore = 0;
                turnNumber++;
                continueTurn = true;
                continue;
            }

            turnScore += die;
            System.out.println("Turn score: " + turnScore);
            System.out.println("Roll or hold? (r/h): ");
            char choice = scanner.next().charAt(0);

            if (choice == 'h') {
                totalScore += turnScore;
                System.out.println("Total score: " + totalScore);
                System.out.println();
                turnScore = 0;
                turnNumber++;
                continueTurn = true;
            }
        }

        System.out.println("You finished in " + turnNumber + " turns!");
        System.out.println("Game over!");
    }

    public static int rollDie(Random random) {
        return random.nextInt(6) + 1;
    }
}
