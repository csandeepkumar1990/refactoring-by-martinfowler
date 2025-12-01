package com.refactoring.chapter8.organizingdata.replacedatavaluewithobject;

/**
 * Supporting Customer class for Replace Data Value with Object example
 */
public class Customer {
    private final String _name;
    
    public Customer(String name) {
        _name = name;
    }
    
    public String getName() {
        return _name;
    }
}

