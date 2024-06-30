package com.techlabs.solution.model;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Inventory {
    private final Map<String, Product> products = new ConcurrentHashMap<>();
    private final Map<String, Supplier> suppliers = new ConcurrentHashMap<>();
    private final List<Transaction> transactions = Collections.synchronizedList(new ArrayList<>());
    private final Lock lock = new ReentrantLock();

    public void addProduct(Product product) {
        if (products.containsKey(product.getProductId())) {
            throw new IllegalArgumentException("Product with ID " + product.getProductId() + " already exists.");
        }
        products.put(product.getProductId(), product);
    }

    public void updateProduct(String productId, String name, String description, int quantity, double price) {
        Product product = getProduct(productId);
        product.setName(name);
        product.setDescription(description);
        product.setQuantity(quantity);
        product.setPrice(price);
    }

    public void deleteProduct(String productId) {
        if (!products.containsKey(productId)) {
            throw new IllegalArgumentException("Product with ID " + productId + " does not exist.");
        }
        products.remove(productId);
    }

    public Product getProduct(String productId) {
        if (!products.containsKey(productId)) {
            throw new IllegalArgumentException("Product with ID " + productId + " does not exist.");
        }
        return products.get(productId);
    }

    public Collection<Product> getAllProducts() {
        return products.values();
    }

    public void addSupplier(Supplier supplier) {
        if (suppliers.containsKey(supplier.getSupplierId())) {
            throw new IllegalArgumentException("Supplier with ID " + supplier.getSupplierId() + " already exists.");
        }
        suppliers.put(supplier.getSupplierId(), supplier);
    }

    public void updateSupplier(String supplierId, String name, String contactInformation) {
        Supplier supplier = getSupplier(supplierId);
        supplier.setName(name);
        supplier.setContactInformation(contactInformation);
    }

    public void deleteSupplier(String supplierId) {
        if (!suppliers.containsKey(supplierId)) {
            throw new IllegalArgumentException("Supplier with ID " + supplierId + " does not exist.");
        }
        suppliers.remove(supplierId);
    }

    public Supplier getSupplier(String supplierId) {
        if (!suppliers.containsKey(supplierId)) {
            throw new IllegalArgumentException("Supplier with ID " + supplierId + " does not exist.");
        }
        return suppliers.get(supplierId);
    }

    public Collection<Supplier> getAllSuppliers() {
        return suppliers.values();
    }

    public void addStock(String productId, int quantity) {
        lock.lock();
        try {
            Product product = getProduct(productId);
            product.setQuantity(product.getQuantity() + quantity);
            transactions.add(new Transaction(UUID.randomUUID().toString(), productId, "add", quantity, new Date()));
        } finally {
            lock.unlock();
        }
    }

    public void removeStock(String productId, int quantity) {
        lock.lock();
        try {
            Product product = getProduct(productId);
            if (product.getQuantity() < quantity) {
                throw new IllegalArgumentException("Insufficient stock for product ID " + productId);
            }
            product.setQuantity(product.getQuantity() - quantity);
            transactions.add(new Transaction(UUID.randomUUID().toString(), productId, "remove", quantity, new Date()));
        } finally {
            lock.unlock();
        }
    }

    public List<Transaction> getTransactionHistory(String productId) {
        List<Transaction> productTransactions = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.getProductId().equals(productId)) {
                productTransactions.add(transaction);
            }
        }
        return productTransactions;
    }
}
