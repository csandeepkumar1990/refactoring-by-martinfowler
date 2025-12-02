package com.refactoring.chapter8.organizingdata.changevaluetoreference;

/**
 * Change Value to Reference - BEFORE Refactoring
 * 
 * Each Order creates its own Customer instance. If we need to share
 * customer data across orders, we should use a reference object instead.
 */
public class OrderBefore {
    private Customer _customer;
    
    /**
     * PROBLEM: Uses Customer.create() which creates a NEW Customer instance.
     * Even if multiple orders have the same customer name, they each get
     * their own separate Customer object (value object pattern).
     * 
     * Example:
     *   OrderBefore o1 = new OrderBefore("John");
     *   OrderBefore o2 = new OrderBefore("John");
     *   // o1._customer != o2._customer (different objects!)
     */
    public OrderBefore(String customerName) {
        _customer = Customer.create(customerName);  // Creates NEW instance every time
    }
    
    public String getCustomerName() {
        return _customer.getName();
    }
    
    /**
     * Same issue: creates a new Customer instance instead of reusing existing one.
     */
    public void setCustomer(String customerName) {
        _customer = Customer.create(customerName);  // Creates NEW instance every time
    }
}

