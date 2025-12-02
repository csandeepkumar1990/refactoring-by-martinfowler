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
    
    /**
     * SOLUTION: Uses Customer.getNamed() which returns a SHARED Customer instance
     * from the registry. Multiple orders with the same customer name will reference
     * the same Customer object (reference object pattern).
     * 
     * Example:
     *   Customer.loadCustomers();  // Must load customers first
     *   OrderAfter o1 = new OrderAfter("Lemon Car Hire");
     *   OrderAfter o2 = new OrderAfter("Lemon Car Hire");
     *   // o1._customer == o2._customer (same shared object!)
     * 
     * Benefits:
     * - Shared state: changes to customer affect all orders
     * - Memory efficient: one object instead of many duplicates
     * - Identity equality: can use == instead of equals()
     */
    public OrderAfter(String customerName) {
        _customer = Customer.getNamed(customerName);  // Returns SHARED instance from map
    }
    
    public String getCustomerName() {
        return _customer.getName();
    }
    
    /**
     * Uses getNamed() to get the shared Customer instance from the registry.
     */
    public void setCustomer(String customerName) {
        _customer = Customer.getNamed(customerName);  // Returns SHARED instance from map
    }
}

