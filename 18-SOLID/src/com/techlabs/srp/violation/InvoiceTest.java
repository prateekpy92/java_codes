package com.techlabs.srp.violation;

import com.techlabs.srp.solution.Invoice;
import com.techlabs.srp.solution.InvoiceCalculator;
import com.techlabs.srp.solution.InvoicePrinter;
public class InvoiceTest {
    public static void main(String[] args) {
      
        Invoice invoice = new Invoice("111001", "Laptop", 30000.00);
        InvoiceCalculator.calculateTax(invoice);
        InvoicePrinter printer = new InvoicePrinter(invoice);
        printer.printInvoice();
    }
}
