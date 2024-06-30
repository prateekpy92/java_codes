package com.techlabs.solution.model;

public class FileUtil {

	public static void saveProductsToFile(Collection<Product> products, String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Product product : products) {
                writer.write(product.toString());
                writer.newLine();
            }
        }
    }

    public static void saveSuppliersToFile(Collection<Supplier> suppliers, String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Supplier supplier : suppliers) {
                writer.write(supplier.toString());
                writer.newLine();
            }
        }
    }

    public static void saveTransactionsToFile(List<Transaction> transactions, String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Transaction transaction : transactions) {
                writer.write(transaction.toString());
                writer.newLine();
            }
        }
    }

    // Implement load methods similarly if needed
}
