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
    // Registry map: stores Customer instances by name for reference object pattern
    // Key: customer name, Value: shared Customer instance
    private static Map<String, Customer> _instances = new HashMap<>();
    
    private Customer(String name) {
        _name = name;
    }
    
    /**
     * VALUE OBJECT PATTERN (BEFORE refactoring)
     * Creates a NEW Customer instance every time it's called.
     * Even if called with the same name, returns a different object.
     * 
     * Example: Customer.create("John") != Customer.create("John") // true (different objects)
     */
    public static Customer create(String name) {
        return new Customer(name);  // Always creates a new instance
    }
    
    /**
     * REFERENCE OBJECT PATTERN (AFTER refactoring)
     * Returns an EXISTING Customer instance from the registry map.
     * Multiple calls with the same name return the SAME shared object.
     * Returns null if the customer doesn't exist in the registry.
     * 
     * Example: Customer.getNamed("John") == Customer.getNamed("John") // true (same object)
     * 
     * Note: Customers must be loaded into the registry first via loadCustomers()
     */
    public static Customer getNamed(String name) {
        return _instances.get(name);  // Returns existing instance from map, or null if not found
    }
    
    /**
     * Pre-loads Customer instances into the registry.
     * These customers can then be retrieved via getNamed() as shared reference objects.
     */
    public static void loadCustomers() {
        new Customer("Lemon Car Hire").store();
        new Customer("Associated Coffee Machines").store();
        new Customer("Bilston Gasworks").store();
    }
    
    /**
     * Stores this Customer instance in the registry map.
     * Used internally by loadCustomers() to populate the shared instances.
     */
    private void store() {
        _instances.put(this.getName(), this);  // Store in map: name -> Customer instance
    }
    
    public String getName() {
        return _name;
    }
}

