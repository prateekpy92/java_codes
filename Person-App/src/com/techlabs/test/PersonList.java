package com.techlabs.test;
import com.techlabs.model.Person;
import java.io.IOException;
import java.util.Scanner;
public class PersonList {

	    public static void main(String[] args) {
	        Person manager = new Person();
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\nMenu:");
	            System.out.println("1. Add Person");
	            System.out.println("2. Add Person at Beginning");
	            System.out.println("3. Add Person at End");
	            System.out.println("4. Insert Person at Position");
	            System.out.println("5. Display All Persons");
	            System.out.println("6. Get Person at Position");
	            System.out.println("7. Update Person at Position");
	            System.out.println("8. Remove Person at Position");
	            System.out.println("9. Check if Person Exists");
	            System.out.println("10. Get Index of Person");
	            System.out.println("11. Clear All Persons");
	            System.out.println("12. Save to Text File");
	            System.out.println("13. Load from Text File");
	            System.out.println("14. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
	            scanner.nextLine();  // Consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter age: ");
	                    int age = scanner.nextInt();
	                    scanner.nextLine();  // Consume newline
	                    System.out.print("Enter address: ");
	                    String address = scanner.nextLine();
	                    manager.addPerson(new Person());
	                    break;

	                case 2:
	                    System.out.print("Enter name: ");
	                    name = scanner.nextLine();
	                    System.out.print("Enter age: ");
	                    age = scanner.nextInt();
	                    scanner.nextLine();  // Consume newline
	                    System.out.print("Enter address: ");
	                    address = scanner.nextLine();
	                    manager.addPersonAtBeginning(new Person());
	                    break;

	                case 3:
	                    System.out.print("Enter name: ");
	                    name = scanner.nextLine();
	                    System.out.print("Enter age: ");
	                    age = scanner.nextInt();
	                    scanner.nextLine();  // Consume newline
	                    System.out.print("Enter address: ");
	                    address = scanner.nextLine();
	                    manager.addPersonAtEnd(new Person());
	                    break;

	                case 4:
	                    System.out.print("Enter position (0-based index): ");
	                    int position = scanner.nextInt();
	                    scanner.nextLine();  // Consume newline
	                    System.out.print("Enter name: ");
	                    name = scanner.nextLine();
	                    System.out.print("Enter age: ");
	                    age = scanner.nextInt();
	                    scanner.nextLine();  // Consume newline
	                    System.out.print("Enter address: ");
	                    address = scanner.nextLine();
	                    manager.insertPersonAt(position, new Person());
	                    break;

	                case 5:
	                    System.out.println("List of persons:");
	                    manager.printAllPersons();
	                    break;

	                case 6:
	                    System.out.print("Enter position (0-based index): ");
	                    position = scanner.nextInt();
	                    scanner.nextLine();  // Consume newline
	                    System.out.println("Person at position " + position + ": " + manager.getPerson(position));
	                    break;

	                case 7:
	                    System.out.print("Enter position (0-based index): ");
	                    position = scanner.nextInt();
	                    scanner.nextLine();  // Consume newline
	                    System.out.print("Enter new name: ");
	                    name = scanner.nextLine();
	                    System.out.print("Enter new age: ");
	                    age = scanner.nextInt();
	                    scanner.nextLine();  // Consume newline
	                    System.out.print("Enter new address: ");
	                    address = scanner.nextLine();
	                    manager.updatePerson(position, new Person());
	                    break;

	                case 8:
	                    System.out.print("Enter position (0-based index): ");
	                    position = scanner.nextInt();
	                    scanner.nextLine();  // Consume newline
	                    manager.removePerson(position);
	                    break;

	                case 9:
	                    System.out.print("Enter name: ");
	                    name = scanner.nextLine();
	                    System.out.print("Enter age: ");
	                    age = scanner.nextInt();
	                    scanner.nextLine();  // Consume newline
	                    System.out.print("Enter address: ");
	                    address = scanner.nextLine();
	                    boolean exists = manager.containsPerson(new Person());
	                    System.out.println("Person exists: " + exists);
	                    break;

	                case 10:
	                    System.out.print("Enter name: ");
	                    name = scanner.nextLine();
	                    System.out.print("Enter age: ");
	                    age = scanner.nextInt();
	                    scanner.nextLine();  // Consume newline
	                    System.out.print("Enter address: ");
	                    address = scanner.nextLine();
	                    int index = manager.indexOfPerson(new Person());
	                    System.out.println("Index of person: " + index);
	                    break;

	                case 11:
	                    manager.clearAllPersons();
	                    System.out.println("All persons cleared.");
	                    break;

	                case 12:
	                    System.out.print("Enter filename to save: ");
	                    String saveFilename = scanner.nextLine();
	                    try {
	                        manager.saveToTextFile(saveFilename);
	                        System.out.println("Data saved to " + saveFilename);
	                    } catch (IOException e) {
	                        System.out.println("Error saving data: " + e.getMessage());
	                    }
	                    break;

	                case 13:
	                    System.out.print("Enter filename to load: ");
	                    String loadFilename = scanner.nextLine();
	                    try {
	                        manager.loadFromTextFile(loadFilename);
	                        System.out.println("Data loaded from " + loadFilename);
	                    } catch (IOException e) {
	                        System.out.println("Error loading data: " + e.getMessage());
	                    }
	                    break;

	                case 14:
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 14);

	        scanner.close();
	    }
	}


