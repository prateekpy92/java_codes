package com.techlabs.facade.solution.test;

import java.util.Scanner;

import com.techlabs.facade.solution.model.Biscuit;
import com.techlabs.facade.solution.model.Chocolate;
import com.techlabs.facade.solution.model.Hat;
import com.techlabs.facade.solution.model.HatAdapter;
import com.techlabs.facade.solution.model.IItems;
import com.techlabs.facade.solution.model.ShoppingCart;

public class CartTesting {

	public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add Biscuit");
            System.out.println("2. Add Chocolate");
            System.out.println("3. Add Hat");
            System.out.println("4. View Cart");
            System.out.println("5. View Total Price");
            System.out.println("6. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter biscuit name: ");
                    String biscuitName = scanner.nextLine();
                    System.out.print("Enter biscuit price: ");
                    double biscuitPrice = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline
                    Biscuit biscuit = new Biscuit(biscuitName, biscuitPrice);
                    cart.addItemToCart(biscuit);
                    System.out.println("Biscuit added to cart.");
                    break;

                case 2:
                    System.out.print("Enter chocolate name: ");
                    String chocolateName = scanner.nextLine();
                    System.out.print("Enter chocolate price: ");
                    double chocolatePrice = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline
                    Chocolate chocolate = new Chocolate(chocolateName, chocolatePrice);
                    cart.addItemToCart(chocolate);
                    System.out.println("Chocolate added to cart.");
                    break;

                case 3:
                    System.out.print("Enter hat short name: ");
                    String shortName = scanner.nextLine();
                    System.out.print("Enter hat long name: ");
                    String longName = scanner.nextLine();
                    System.out.print("Enter hat base price: ");
                    double basePrice = scanner.nextDouble();
                    System.out.print("Enter hat tax: ");
                    double tax = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline
                    Hat hat = new Hat(shortName, longName, basePrice, tax);
                    HatAdapter hatAdapter = new HatAdapter(hat);
                    cart.addItemToCart(hatAdapter);
                    System.out.println("Hat added to cart.");
                    break;

                case 4:
                    cart.displayCart();
                    break;

                case 5:
                    System.out.println("Total Cart Price: $" + cart.getCartPrice());
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}