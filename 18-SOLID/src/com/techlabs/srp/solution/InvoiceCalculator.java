package com.techlabs.srp.solution;
import com.techlabs.srp.solution.Invoice;
public class InvoiceCalculator {
	  public static void calculateTax(Invoice invoice) {
	     
	        double tax = invoice.getAmount() * 0.18;
	        invoice.setTax(tax) ;
	    }
	

}
