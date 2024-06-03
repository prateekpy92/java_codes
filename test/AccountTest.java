package com.techlabs.test;	
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import com.techlabs.model.SavingsAccount;
import com.techlabs.model.CurrentAccount;
import com.techlabs.model.Account;


public class AccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = null;
        int choice;

        while (true) {
            System.out.println("Select Account Type :");
            System.out.println("1. Savings");
            System.out.println("2. Current");
            System.out.println("3. Exit");

            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("You choose Savings Account.");
                break;
            }

            if (choice == 2) {
                System.out.println("You choose Current Account.");
                break;
            }

            if (choice == 3) {
                return;
            }
        }

        while (true) {
            System.out.println("Select Operation :");
            System.out.println("1. Create Account");
            System.out.println("2. Display Account Details");
            System.out.println("3. Credit into Account");
            System.out.println("4. Debit from Account");
            System.out.println("5. Save Account");
            System.out.println("6. Load Account");
            System.out.println("7. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You selected creating new account");
                    System.out.print("Enter Account Number: ");
                    int accno = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("Enter Account Holder Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Opening Balance: ");
                    double balance = scanner.nextDouble();

                    if (account == null) {
                        if (choice == 1) {
                            System.out.print("Enter Minimum Balance: ");
                            double minBalance = scanner.nextDouble();
                            account = new SavingsAccount(accno, name, balance, minBalance);
                        } else {
                            System.out.print("Enter Overdraft Limit: ");
                            double overdraftLimit = scanner.nextDouble();
                            account = new CurrentAccount(accno, name, balance, overdraftLimit);
                        }
                        System.out.println("Your Account is created.");
                    }
                    break;

                case 2:
                    if (account != null) {
                        account.displayDetails();
                    } else {
                        System.out.println("No account exists.");
                    }try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("account.ser"))) {
                        account = (Account) in.readObject();
                        System.out.println("Account loaded successfully.");
                    } catch (IOException | ClassNotFoundException e) {
                        System.out.println("Failed to load account.");
                    }
                    break;

                case 3:
                    if (account != null) {
                        System.out.println("You selected crediting into account.");
                        System.out.print("Enter Amount to credit: ");
                        double amount = scanner.nextDouble();
                        account.credit(amount);
                        System.out.println("Amount is Credited.");
                        System.out.println("Your balance is : " + account.getBalance());
                    } else {
                        System.out.println("No account exists.");
                    }
                    break;

                case 4:
                    if (account != null) {
                        System.out.println("You selected debiting from account.");
                        System.out.print("Enter Amount to debit: ");
                        double debitAmount = scanner.nextDouble();
                        account.debit(debitAmount);
                        System.out.println("Your balance is : " + account.getBalance());
                    } else {
                        System.out.println("No account exists.");
                    }
                    break;

                case 5:
                    if (account != null) {
                        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("account.ser"))) {
                            out.writeObject(account);
                            System.out.println("Account saved successfully.");
                        } catch (IOException e) {
                            System.out.println("Failed to save account.");
                        }
                    } else {
                        System.out.println("No account exists to save.");
                    }
                    break;

                case 6:
                    
                    return;

             //   case 7:
                   // return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
