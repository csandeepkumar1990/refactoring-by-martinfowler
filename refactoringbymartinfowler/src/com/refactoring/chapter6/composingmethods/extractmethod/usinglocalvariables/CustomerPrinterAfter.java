package com.refactoring.chapter6.composingmethods.extractmethod.usinglocalvariables;

import java.util.Enumeration;

/**
 * Extract Method - Example: Using Local Variables - AFTER Refactoring
 * 
 * The print details code has been extracted into its own method.
 * The outstanding variable is passed as a parameter since it's read but not modified.
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
        
        printDetails(outstanding);
    }
    
    void printBanner() {
        // print banner
        System.out.println("**************************");
        System.out.println("***** Customer Owes ******");
        System.out.println("**************************");
    }
    
    void printDetails(double outstanding) {
        System.out.println("name:" + customer.getName());
        System.out.println("amount" + outstanding);
    }
}

