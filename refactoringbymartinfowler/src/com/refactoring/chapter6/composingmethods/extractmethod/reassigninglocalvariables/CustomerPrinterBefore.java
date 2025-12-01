package com.refactoring.chapter6.composingmethods.extractmethod.reassigninglocalvariables;

import java.util.Enumeration;

/**
 * Extract Method - Example: Reassigning Local Variables - BEFORE Refactoring
 * 
 * This example shows extracting code that modifies a local variable.
 * The outstanding variable is calculated and then used later, so we need to return it.
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

