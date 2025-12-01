package com.refactoring.chapter9.simplifyingconditionals.introducenullobject;

/**
 * Introduce Null Object - AFTER Refactoring
 * 
 * The null checks have been removed. The code now uses a NullCustomer
 * object that implements the same interface, eliminating null checks.
 */
public class SiteAfter {
    private Customer _customer;
    
    Customer getCustomer() {
        return (_customer == null) ? Customer.newNull() : _customer;
    }
    
    String getCustomerName() {
        return getCustomer().getName();
    }
    
    String getPlan() {
        return getCustomer().getPlan();
    }
}

