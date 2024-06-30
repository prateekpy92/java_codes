package com.techlabs.solution.model;

import java.util.Date;

public class Transaction {
    private final String transactionId;
    private final String productId;
    private final String type; // "add" or "remove"
    private final int quantity;
    private final Date date;

    public Transaction(String transactionId, String productId, String type, int quantity, Date date) {
        this.transactionId = transactionId;
        this.productId = productId;
        this.type = type;
        this.quantity = quantity;
        this.date = date;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getProductId() {
        return productId;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", productId='" + productId + '\'' +
                ", type='" + type + '\'' +
                ", quantity=" + quantity +
                ", date=" + date +
                '}';
    }
}
