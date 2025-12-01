package com.refactoring.chapter8.organizingdata.changevaluetoreference;

/**
 * Change Value to Reference - BEFORE Refactoring
 * 
 * Each Order creates its own Customer instance. If we need to share
 * customer data across orders, we should use a reference object instead.
 */
public class OrderBefore {
    private Customer _customer;
    
    public OrderBefore(String customerName) {
        _customer = Customer.create(customerName);
    }
    
    public String getCustomerName() {
        return _customer.getName();
    }
    
    public void setCustomer(String customerName) {
        _customer = Customer.create(customerName);
    }
}

