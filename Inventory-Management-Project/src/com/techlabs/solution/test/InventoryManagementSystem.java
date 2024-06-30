package com.techlabs.solution.test;

import java.io.IOException;
import java.util.Scanner;

import com.techlabs.solution.model.FileUtil;
import com.techlabs.solution.model.Inventory;
import com.techlabs.solution.model.Product;
import com.techlabs.solution.model.Supplier;
import com.techlabs.solution.model.Transaction;



public class InventoryManagementSystem {
    private static final Inventory inventory = new Inventory();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 : productManagement();
                case 2 : supplierManagement();
                case 3 : transactionManagement();
                case 4 : saveData();
                case 5 : loadData();
                case 6 : generateReports();
                case 7 : {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default : System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("Welcome to the Inventory Management System");
        System.out.println("1. Product Management");
        System.out.println("    1.1 Add Product");
        System.out.println("    1.2 Update Product");
        System.out.println("    1.3 Delete Product");
        System.out.println("    1.4 View Product Details");
        System.out.println("    1.5 View All Products");
        System.out.println("2. Supplier Management");
        System.out.println("    2.1 Add Supplier");
        System.out.println("    2.2 Update Supplier");
        System.out.println("    2.3 Delete Supplier");
        System.out.println("    2.4 View Supplier Details");
        System.out.println("    2.5 View All Suppliers");
        System.out.println("3. Transaction Management");
        System.out.println("    3.1 Add Stock");
        System.out.println("    3.2 Remove Stock");
        System.out.println("    3.3 View Transaction History");
        System.out.println("4. Save Data");
        System.out.println("5. Load Data");
        System.out.println("6. Generate Reports");
        System.out.println("7. Exit");
        System.out.println("Enter your choice: ");
    }

    private static void productManagement() {
        System.out.println("Product Management");
        System.out.println("1. Add Product");
        System.out.println("2. Update Product");
        System.out.println("3. Delete Product");
        System.out.println("4. View Product Details");
        System.out.println("5. View All Products");
        System.out.println("Enter your choice: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:  addProduct();
            case 2 : updateProduct();
            case 3 : deleteProduct();
            case 4: viewProductDetails();
            case 5 : viewAllProducts();
            default:  System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void supplierManagement() {
        System.out.println("Supplier Management");
        System.out.println("1. Add Supplier");
        System.out.println("2. Update Supplier");
        System.out.println("3. Delete Supplier");
        System.out.println("4. View Supplier Details");
        System.out.println("5. View All Suppliers");
        System.out.println("Enter your choice: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:  addSupplier();
            case 2:  updateSupplier();
            case 3:  deleteSupplier();
            case 4:  viewSupplierDetails();
            case 5:  viewAllSuppliers();
            default:  System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void transactionManagement() {
        System.out.println("Transaction Management");
        System.out.println("1. Add Stock");
        System.out.println("2. Remove Stock");
        System.out.println("3. View Transaction History");
        System.out.println("Enter your choice: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1 : addStock();
            case 2 : removeStock();
            case 3 : viewTransactionHistory();
            default :System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void saveData() {
        try {
            FileUtil.saveProductsToFile(inventory.getAllProducts(), "products.txt");
            FileUtil.saveSuppliersToFile(inventory.getAllSuppliers(), "suppliers.txt");
            FileUtil.saveTransactionsToFile(inventory.getTransactionHistory(""), "transactions.txt");
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    private static void loadData() {
        // Implement loading logic if needed
        System.out.println("Loading data is not implemented yet.");
    }

    private static void generateReports() {
        System.out.println("Total number of products: " + inventory.getAllProducts().size());
        System.out.println("Total number of suppliers: " + inventory.getAllSuppliers().size());
        // Implement more report generation logic if needed
    }

    private static void addProduct() {
        System.out.println("Enter Product ID:");
        String productId = scanner.nextLine();
        System.out.println("Enter Product Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Product Description:");
        String description = scanner.nextLine();
        System.out.println("Enter Product Quantity:");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Product Price:");
        double price = Double.parseDouble(scanner.nextLine());

        Product product = new Product(productId, name, description, quantity, price);
        inventory.addProduct(product);
        System.out.println("Product added successfully.");
    }

    private static void updateProduct() {
        System.out.println("Enter Product ID to update:");
        String productId = scanner.nextLine();
        System.out.println("Enter new Product Name:");
        String name = scanner.nextLine();
        System.out.println("Enter new Product Description:");
        String description = scanner.nextLine();
        System.out.println("Enter new Product Quantity:");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter new Product Price:");
        double price = Double.parseDouble(scanner.nextLine());

        inventory.updateProduct(productId, name, description, quantity, price);
        System.out.println("Product updated successfully.");
    }

    private static void deleteProduct() {
        System.out.println("Enter Product ID to delete:");
        String productId = scanner.nextLine();
        inventory.deleteProduct(productId);
        System.out.println("Product deleted successfully.");
    }

    private static void viewProductDetails() {
        System.out.println("Enter Product ID to view details:");
        String productId = scanner.nextLine();
        Product product = inventory.getProduct(productId);
        System.out.println(product);
    }

    private static void viewAllProducts() {
        for (Product product : inventory.getAllProducts()) {
            System.out.println(product);
        }
    }

    private static void addSupplier() {
        System.out.println("Enter Supplier ID:");
        String supplierId = scanner.nextLine();
        System.out.println("Enter Supplier Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Supplier Contact Information:");
        String contactInformation = scanner.nextLine();

        Supplier supplier = new Supplier(supplierId, name, contactInformation);
        inventory.addSupplier(supplier);
        System.out.println("Supplier added successfully.");
    }

    private static void updateSupplier() {
        System.out.println("Enter Supplier ID to update:");
        String supplierId = scanner.nextLine();
        System.out.println("Enter new Supplier Name:");
        String name = scanner.nextLine();
        System.out.println("Enter new Supplier Contact Information:");
        String contactInformation = scanner.nextLine();

        inventory.updateSupplier(supplierId, name, contactInformation);
        System.out.println("Supplier updated successfully.");
    }

    private static void deleteSupplier() {
        System.out.println("Enter Supplier ID to delete:");
        String supplierId = scanner.nextLine();
        inventory.deleteSupplier(supplierId);
        System.out.println("Supplier deleted successfully.");
    }

    private static void viewSupplierDetails() {
        System.out.println("Enter Supplier ID to view details:");
        String supplierId = scanner.nextLine();
        Supplier supplier = inventory.getSupplier(supplierId);
        System.out.println(supplier);
    }

    private static void viewAllSuppliers() {
        for (Supplier supplier : inventory.getAllSuppliers()) {
            System.out.println(supplier);
        }
    }

    private static void addStock() {
        System.out.println("Enter Product ID to add stock:");
        String productId = scanner.nextLine();
        System.out.println("Enter quantity to add:");
        int quantity = Integer.parseInt(scanner.nextLine());

        inventory.addStock(productId, quantity);
        System.out.println("Stock added successfully.");
    }

    private static void removeStock() {
        System.out.println("Enter Product ID to remove stock:");
        String productId = scanner.nextLine();
        System.out.println("Enter quantity to remove:");
        int quantity = Integer.parseInt(scanner.nextLine());

        inventory.removeStock(productId, quantity);
        System.out.println("Stock removed successfully.");
    }

    private static void viewTransactionHistory() {
        System.out.println("Enter Product ID to view transaction history:");
        String productId = scanner.nextLine();
        for (Transaction transaction : inventory.getTransactionHistory(productId)) {
            System.out.println(transaction);
        }
    }
}
