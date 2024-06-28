package com.techlabs.srp.solution;

public class InvoicePrinter {
	 private Invoice invoice;

	    public InvoicePrinter(Invoice invoice) {
	        this.invoice = invoice;
	    }

	    public void printInvoice() {
	        System.out.println("Invoice ID: " + invoice.getId());
	        System.out.println("Description: " + invoice.getDescription());
	        System.out.println("Amount: $" + invoice.getAmount());
	        System.out.println("Tax: $" + invoice.getTax());
	        System.out.println("Total: $" + (invoice.getAmount() + invoice.getTax()));
	    }


}
