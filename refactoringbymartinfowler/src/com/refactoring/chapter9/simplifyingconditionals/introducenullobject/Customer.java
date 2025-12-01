package com.refactoring.chapter9.simplifyingconditionals.introducenullobject;

/**
 * Supporting Customer class for Introduce Null Object example
 */
public class Customer {
    private String _name;
    
    public Customer(String name) {
        _name = name;
    }
    
    public String getName() {
        return _name;
    }
    
    public boolean isNull() {
        return false;
    }
    
    public String getPlan() {
        return "Standard Plan";
    }
    
    public static Customer newNull() {
        return new NullCustomer();
    }
}

class NullCustomer extends Customer {
    public NullCustomer() {
        super("Unknown");
    }
    
    public boolean isNull() {
        return true;
    }
    
    public String getPlan() {
        return "Basic Plan";
    }
}

