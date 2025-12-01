package com.refactoring.chapter3.badsmells;

/**
 * Chapter 3: Bad Smells in Code - Large Class
 * 
 * SMELL: A class has too many responsibilities and too many instance variables.
 * 
 * SOLUTION: Extract Class to separate responsibilities into different classes.
 * 
 * Signs of a large class:
 * - Too many instance variables (more than ~6-7)
 * - Too many methods
 * - Duplicated code
 * - Incomplete abstraction
 */
public class LargeClass {
    // BEFORE: Class with too many responsibilities
    // This class handles both customer data AND order processing
    private String customerName;
    private String customerAddress;
    private String customerEmail;
    private String orderId;
    private java.util.List<String> orderItems;
    private double orderTotal;
    private String shippingAddress;
    private String paymentMethod;
    // ... many more fields
    
    public void processOrder() {
        // order processing logic
    }
    
    public void sendCustomerEmail() {
        // email sending logic
    }
    
    public void calculateShipping() {
        // shipping calculation
    }
    
    // ... many more methods
}

/**
 * AFTER: Responsibilities separated into different classes
 */
class CustomerAfter {
    private String name;
    private String address;
    private String email;
    
    public void sendEmail(String message) {
        // email sending logic
    }
}

class OrderAfter {
    private String orderId;
    private java.util.List<String> items;
    private double total;
    private CustomerAfter customer;
    
    public void process() {
        // order processing logic
    }
    
    public double calculateShipping() {
        // shipping calculation
        return 0;
    }
}

