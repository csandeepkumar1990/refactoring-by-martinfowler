package com.refactoring.chapter8.organizingdata.changevaluetoreference;

/**
 * Change Value to Reference - AFTER Refactoring
 * 
 * Orders now use shared Customer instances from a factory.
 * This allows multiple orders to reference the same customer object,
 * enabling shared state and behavior.
 */
public class OrderAfter {
    private Customer _customer;
    
    public OrderAfter(String customerName) {
        _customer = Customer.getNamed(customerName);
    }
    
    public String getCustomerName() {
        return _customer.getName();
    }
    
    public void setCustomer(String customerName) {
        _customer = Customer.getNamed(customerName);
    }
}

