package com.refactoring.chapter8.organizingdata.replacedatavaluewithobject;

/**
 * Replace Data Value with Object - AFTER Refactoring
 * 
 * The customer String has been replaced with a Customer object.
 * This allows us to add more customer-related data and behavior
 * in the future without changing Order.
 */
public class OrderAfter {
    private Customer _customer;
    
    public OrderAfter(String customerName) {
        _customer = new Customer(customerName);
    }
    
    public String getCustomerName() {
        return _customer.getName();
    }
    
    public void setCustomer(String customerName) {
        _customer = new Customer(customerName);
    }
}

