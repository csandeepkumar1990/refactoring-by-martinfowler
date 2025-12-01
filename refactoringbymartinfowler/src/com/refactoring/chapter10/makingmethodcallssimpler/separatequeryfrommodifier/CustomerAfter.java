package com.refactoring.chapter10.makingmethodcallssimpler.separatequeryfrommodifier;

/**
 * Separate Query from Modifier - AFTER Refactoring
 * 
 * The method has been split into two methods: one that queries (getTotalOutstanding)
 * and one that modifies (setReady). This makes the code clearer and safer.
 */
public class CustomerAfter {
    private String _name;
    private int _outstanding;
    
    int getTotalOutstanding() {
        return _outstanding;
    }
    
    void setReady() {
        _name = "Processed: " + _name;
    }
}

