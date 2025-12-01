package com.refactoring.chapter8.organizingdata.encapsulatefield;

/**
 * Encapsulate Field - AFTER Refactoring
 * 
 * The field is now private and accessed through getter and setter methods.
 * This provides better control over field access and allows for future
 * modifications (validation, logging, etc.) without changing the interface.
 */
public class PersonAfter {
    private String _name;
    
    public String getName() {
        return _name;
    }
    
    public void setName(String arg) {
        _name = arg;
    }
}

