package com.refactoring.chapter10.makingmethodcallssimpler.separatequeryfrommodifier;

/**
 * Separate Query from Modifier - BEFORE Refactoring
 * 
 * The method both returns a value and has side effects (modifies state).
 * We should separate the query (getting value) from the modifier (changing state).
 */
public class CustomerBefore {
    private String _name;
    private int _outstanding;
    
    int getTotalOutstandingAndSetReady() {
        _name = "Processed: " + _name;
        return _outstanding;
    }
}

