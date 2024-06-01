package com.teclabs.assi;

import java.util.Scanner;

public class season {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        String season = identifySeason(month);
        System.out.println("The season is: " + season);
        scanner.close();
    }

    public static String identifySeason(int month) {
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Summer";
                break;
            case 6:
            case 7:
            case 8:
                season = "Monsoon";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Invalid month";
                break;
        }
        return season;
    }


	}


