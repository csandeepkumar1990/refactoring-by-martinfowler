package com.refactoring.chapter6.composingmethods.extractmethod.usinglocalvariables;

import java.util.Enumeration;

/**
 * Extract Method - Example: Using Local Variables - BEFORE Refactoring
 * 
 * This example shows extracting code that uses local variables (read but not changed).
 * The outstanding variable is read in the print details section, so we pass it as a parameter.
 */
public class CustomerPrinterBefore {
    private Customer customer;
    
    public CustomerPrinterBefore(Customer customer) {
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

