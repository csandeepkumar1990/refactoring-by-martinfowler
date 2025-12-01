package com.refactoring.chapter6.composingmethods.extractmethod.nolocalvariables;

import java.util.Enumeration;

/**
 * Extract Method - Example: No Local Variables - BEFORE Refactoring
 * 
 * This is the simplest case where we extract code that doesn't use any local variables.
 * The banner printing code can be extracted into its own method.
 */
public class CustomerPrinterBefore {
    private Customer customer;
    
    public CustomerPrinterBefore(Customer customer) {
        this.customer = customer;
    }
    
    void printOwing() {
        Enumeration<Order> e = customer.getOrders();
        double outstanding = 0.0;
        
        // print banner
        System.out.println("**************************");
        System.out.println("***** Customer Owes ******");
        System.out.println("**************************");
        
        // calculate outstanding
        while (e.hasMoreElements()) {
            Order each = e.nextElement();
            outstanding += each.getAmount();
        }
        
        // print details
        System.out.println("name:" + customer.getName());
        System.out.println("amount" + outstanding);
    }
}

