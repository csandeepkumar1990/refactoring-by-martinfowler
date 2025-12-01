package com.refactoring.chapter9.simplifyingconditionals.introducenullobject;

/**
 * Introduce Null Object - BEFORE Refactoring
 * 
 * The code checks for null customer repeatedly. We should introduce
 * a NullCustomer object that implements the same interface but does nothing.
 */
public class SiteBefore {
    private Customer _customer;
    
    Customer getCustomer() {
        return _customer;
    }
    
    String getCustomerName() {
        if (_customer == null) {
            return "Unknown";
        } else {
            return _customer.getName();
        }
    }
    
    String getPlan() {
        if (_customer == null) {
            return "Basic Plan";
        } else {
            return _customer.getPlan();
        }
    }
}

