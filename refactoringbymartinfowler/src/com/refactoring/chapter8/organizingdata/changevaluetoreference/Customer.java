package com.refactoring.chapter8.organizingdata.changevaluetoreference;

import java.util.HashMap;
import java.util.Map;

/**
 * Supporting Customer class for Change Value to Reference example
 * 
 * BEFORE: Each Order creates its own Customer instance (value object)
 * AFTER: Customer instances are shared (reference object) via a factory
 */
public class Customer {
    private final String _name;
    private static Map<String, Customer> _instances = new HashMap<>();
    
    private Customer(String name) {
        _name = name;
    }
    
    public static Customer create(String name) {
        return new Customer(name);
    }
    
    public static Customer getNamed(String name) {
        return _instances.get(name);
    }
    
    public static void loadCustomers() {
        new Customer("Lemon Car Hire").store();
        new Customer("Associated Coffee Machines").store();
        new Customer("Bilston Gasworks").store();
    }
    
    private void store() {
        _instances.put(this.getName(), this);
    }
    
    public String getName() {
        return _name;
    }
}

