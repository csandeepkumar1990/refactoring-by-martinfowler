package com.refactoring.chapter6.composingmethods.extractmethod.nolocalvariables;

import java.util.Enumeration;

/**
 * Extract Method - Example: No Local Variables - AFTER Refactoring
 * 
 * The banner printing code has been extracted into its own method.
 * This makes the printOwing method more readable and the banner printing
 * logic can be reused elsewhere.
 */
public class CustomerPrinterAfter {
    private Customer customer;
    
    public CustomerPrinterAfter(Customer customer) {
        this.customer = customer;
    }
    
    void printOwing() {
        Enumeration<Order> e = customer.getOrders();
        double outstanding = 0.0;
        
        printBanner();
        
        // calculate outstanding
        while (e.hasMoreElements()) {
            Order each = e.nextElement();
            outstanding += each.getAmount();
        }
        
        // print details
        System.out.println("name:" + customer.getName());
        System.out.println("amount" + outstanding);
    }
    
    void printBanner() {
        // print banner
        System.out.println("**************************");
        System.out.println("***** Customer Owes ******");
        System.out.println("**************************");
    }
}

