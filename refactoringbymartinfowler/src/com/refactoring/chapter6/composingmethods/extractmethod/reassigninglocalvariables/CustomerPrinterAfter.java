package com.refactoring.chapter6.composingmethods.extractmethod.reassigninglocalvariables;

import java.util.Enumeration;

/**
 * Extract Method - Example: Reassigning Local Variables - AFTER Refactoring
 * 
 * The calculation of outstanding has been extracted into its own method.
 * Since the outstanding variable is modified and used later, the extracted method
 * returns the calculated value. The enumeration variable is moved entirely within
 * the new method since it's only used there.
 */
public class CustomerPrinterAfter {
    private Customer customer;
    
    public CustomerPrinterAfter(Customer customer) {
        this.customer = customer;
    }
    
    void printOwing() {
        printBanner();
        double outstanding = getOutstanding();
        printDetails(outstanding);
    }
    
    void printBanner() {
        // print banner
        System.out.println("**************************");
        System.out.println("***** Customer Owes ******");
        System.out.println("**************************");
    }
    
    double getOutstanding() {
        double result = 0.0;
        Enumeration<Order> e = customer.getOrders();
        while (e.hasMoreElements()) {
            Order each = e.nextElement();
            result += each.getAmount();
        }
        return result;
    }
    
    void printDetails(double outstanding) {
        System.out.println("name:" + customer.getName());
        System.out.println("amount" + outstanding);
    }
}

